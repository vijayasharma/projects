package com.vijaya.caster.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vijaya.caster.domain.Profile;
import com.vijaya.caster.domain.RegistrationDto;
import com.vijaya.caster.utils.Constants;
import com.vijaya.caster.web.validators.PasswordValidator;
import com.vijaya.caster.web.validators.ProfileValidator;

@Controller
public class RegistrationController {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	private ProfileValidator profileValidator;
	
	@Autowired
	private PasswordValidator passwordValidator; 

	public void setProfileValidator(ProfileValidator profileValidator) {
		this.profileValidator = profileValidator;
	}

	public void setPasswordValidator(PasswordValidator passwordValidator) {
		this.passwordValidator = passwordValidator;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// CONVERT empty date to null
		SimpleDateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT_SLASHED);
		dateFormat.setLenient(false);
		// true passed to CustomDateEditor constructor means convert empty
		// String to null
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

	}

	/**
	 * Default exception handler
	 */
	@ExceptionHandler(Exception.class)
	public String defaultExceptionHandler(Exception ex) {
		logger.error("Exception occured in RegistrationController. ", ex);
		return "error";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegistrationForm(Model model) {
		logger.info("Inside showRegistrationForm method.");
		ModelAndView mav = new ModelAndView();

		//Profile p = new Profile();
		RegistrationDto dto = new RegistrationDto();
		mav.addObject("registration", dto);

		mav.setViewName("registration");
		return mav;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String patientSubmit(@ModelAttribute("registration") RegistrationDto registrationDto, BindingResult result, ModelMap model) {

		logger.info("New Profile to be saved: {}", registrationDto);
		
		profileValidator.validate(registrationDto.getProfile(), result);
		passwordValidator.validate(registrationDto, result);

		if (result.hasErrors()) {
			logger.info("Errors:  {} ", result.getAllErrors());
						
			return "registration";
		}

		logger.info("Profile validation was successful");
		
		return "redirect:/home";
	}

}
