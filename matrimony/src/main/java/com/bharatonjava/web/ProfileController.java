package com.bharatonjava.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bharatonjava.matri.domain.Profile;
import com.bharatonjava.matri.services.ProfileService;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);
	
	@Autowired
	private ProfileService profileService;
	
	public void setProfileService(ProfileService profileService) {
		this.profileService = profileService;
	}
	
	@RequestMapping(path="/registration", method = RequestMethod.GET)
	public ModelAndView intialRegistration() {
		
		ModelAndView mav = new ModelAndView();
		Profile profile = new Profile();
		mav.addObject("profile", profile);
		mav.setViewName("matri/initialRegistration");
		return mav;
	}
	
	@RequestMapping(path="/registration", method = RequestMethod.POST)
	public ModelAndView doInitialRegistration(@ModelAttribute Profile profile, BindingResult errors, ModelAndView model) {
		logger.info("Inside doInitialRegistration method.");
		logger.info("profile: {}", profile);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("matri/initialRegistration");
		
		if(errors.hasErrors()) {
			mav.addObject("profile", profile);	
		} else {
			profileService.saveProfile(profile);
		}
				
		return mav;
	}
	
	
}
