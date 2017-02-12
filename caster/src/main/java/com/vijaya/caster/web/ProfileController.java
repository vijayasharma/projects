package com.vijaya.caster.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

import com.vijaya.caster.domain.Authority;
import com.vijaya.caster.domain.Profile;
import com.vijaya.caster.domain.User;
import com.vijaya.caster.services.ProfileService;
import com.vijaya.caster.services.RegistrationService;
import com.vijaya.caster.utils.Constants;
import com.vijaya.caster.web.validators.PasswordValidator;
import com.vijaya.caster.web.validators.ProfileValidator;

@Controller
@RequestMapping(value = "/user")
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

	@Autowired
	private ProfileService profileService;

	@Autowired
	private ProfileValidator profileValidator;

	@Autowired
	private PasswordValidator passwordValidator;

	@Autowired
	private RegistrationService registrationService;

	public void setProfileService(ProfileService profileService) {
		this.profileService = profileService;
	}

	public void setProfileValidator(ProfileValidator profileValidator) {
		this.profileValidator = profileValidator;
	}

	public void setPasswordValidator(PasswordValidator passwordValidator) {
		this.passwordValidator = passwordValidator;
	}

	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
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
		logger.error("Exception occured in ProfileController. ", ex);
		return "error";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegistrationForm(Model model) {
		logger.info("Inside showRegistrationForm method.");
		ModelAndView mav = new ModelAndView();

		Profile p = new Profile();
		mav.addObject("profile", p);

		mav.setViewName("registration");
		return mav;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistrationForm(@ModelAttribute("profile") Profile profile, BindingResult result,
			ModelMap model) {

		logger.info("New Profile to be saved: {}", profile);

		profileValidator.validate(profile, result);
		// passwordValidator.validate(profile, result);

		if (result.hasErrors()) {
			logger.info("Errors:  {} ", result.getAllErrors());
			return "registration";
		}

		logger.info("Profile validation was successful");

		// add entry in user
		User user = new User();
		user.setUserName(profile.getEmail());
		user.setPassword(profile.getPassword());
		user.setEnabled(1);
		int userSavedCount = this.profileService.saveUser(user);

		if(userSavedCount == -1){
			result.rejectValue("email","email.alredy.exists", "Email id is alreday registered with us. Please use another email id.");
			model.addAttribute("profile", profile);
			return "registration";
		}else if (userSavedCount == 1) {
			logger.info("user saved successfully. Username = {}", user.getUserName());
			// and save authority
			Authority authority = new Authority();
			authority.setUsername(profile.getEmail());
			authority.setAuthority(Constants.AUTHORITY_ROLE_USER);
			int authorityCount = this.profileService.createAuthority(authority);

			if(authorityCount == 1){
				logger.info("Authority Saved successfully. {}", authority);
				Long profileId = registrationService.saveProfile(profile);
				logger.info("Profile saved succesfully. ProfileId={}", profileId);
			}
		}
		return "redirect:/home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showUserHome(Model model) {

		logger.info("Inside showUserHome method.");

		ModelAndView mav = new ModelAndView();

		mav.setViewName("user.home");

		return mav;
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ModelAndView showUserProfile(Model model) {

		logger.info("Inside showUserProfile method.");

		ModelAndView mav = new ModelAndView();

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String emailId = auth.getName(); // get logged in username
		logger.info("Fetching profile for EmailId = {}", emailId);

		Profile p = this.profileService.getProfileByEmail(emailId);

		if (p != null) {
			mav.addObject("p", p);
			mav.setViewName(Constants.VIEW_USER_PROFILE);
		} else if (p == null){
			// this means profile not found in PROFILE table.
			mav.addObject("p", p);
			mav.addObject(Constants.ERROR_MESSAGE, "Profile not found. Please contact support.");
			mav.setViewName(Constants.VIEW_USER_PROFILE);
		}else{
			mav.setViewName(Constants.VIEW_USER_HOME);
		}

		return mav;

	}

	@RequestMapping(value = "/profile/edit", method = RequestMethod.GET)
	public ModelAndView showUserProfileEditForm(Model model) {

		logger.info("Inside showUserProfileEditForm method.");

		ModelAndView mav = new ModelAndView();

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String emailId = auth.getName(); // get logged in username
		logger.info("Fetching profile for EmailId = {}", emailId);

		Profile p = this.profileService.getProfileByEmail(emailId);

		if (p != null) {
			mav.addObject("p", p);
			mav.addObject("maritalStatusList", this.profileService.getEnumsByGroup(Constants.ENUM_MARITAL_STATUS));
			mav.addObject("heightList", this.profileService.getEnumsByGroup(Constants.ENUM_HEIGHT));
			mav.addObject("bodyTypeList", this.profileService.getEnumsByGroup(Constants.ENUM_BODY_TYPE));
			mav.addObject("skinToneList", this.profileService.getEnumsByGroup(Constants.ENUM_SKIN_TONE));
			mav.addObject("bloodGroupList", this.profileService.getEnumsByGroup(Constants.ENUM_BLOOD_GROUP));
			mav.addObject("religionList", this.profileService.getEnumsByGroup(Constants.ENUM_RELIGION));
			mav.setViewName(Constants.VIEW_USER_PROFILE_UPDATE_FORM);
		} else {
			mav.setViewName(Constants.VIEW_USER_HOME);
		}

		return mav;

	}

	@RequestMapping(value = "/profile/edit", method = RequestMethod.POST)
	public ModelAndView processProfileEditForm(@ModelAttribute("p") Profile profile, BindingResult result,
			Model model) {

		logger.info("Inside processProfileEditForm method. {}", profile);

		ModelAndView mav = new ModelAndView();

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String emailId = auth.getName(); // get logged in username
		logger.info("Logged in user EmailId is: {}", emailId);

		// make sure only logged-in user's profile is updated. Check emailId
		// with profileEmailId
		int count = profileService.updateProfile(profile);

		if (count == 1) {
			mav.setViewName(Constants.VIEW_USER_PROFILE);

		} else {

			Profile p = this.profileService.getProfileByEmail(emailId);

			if (p != null) {
				mav.addObject("p", p);
				mav.addObject("maritalStatusList", this.profileService.getEnumsByGroup(Constants.ENUM_MARITAL_STATUS));
				mav.addObject("heightList", this.profileService.getEnumsByGroup(Constants.ENUM_HEIGHT));
				mav.addObject("bodyTypeList", this.profileService.getEnumsByGroup(Constants.ENUM_BODY_TYPE));
				mav.addObject("skinToneList", this.profileService.getEnumsByGroup(Constants.ENUM_SKIN_TONE));
				mav.addObject("bloodGroupList", this.profileService.getEnumsByGroup(Constants.ENUM_BLOOD_GROUP));
				mav.addObject("religionList", this.profileService.getEnumsByGroup(Constants.ENUM_RELIGION));
				mav.setViewName(Constants.VIEW_USER_PROFILE_UPDATE_FORM);
			} else {
				mav.setViewName(Constants.VIEW_USER_HOME);
			}
		}

		return mav;

	}

}
