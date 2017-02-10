package com.vijaya.caster.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vijaya.caster.domain.Profile;
import com.vijaya.caster.services.ProfileService;
import com.vijaya.caster.utils.Constants;

@Controller
@RequestMapping(value = "/user")
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

	@Autowired
	private ProfileService  profileService;
	
	public void setProfileService(ProfileService profileService) {
		this.profileService = profileService;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showUserHome(Model model) {
		
		logger.info("Inside showUserHome method.");

		ModelAndView mav = new ModelAndView();

		mav.setViewName("user.home");
		
		return mav;
	}
	
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ModelAndView showUserProfile(Model model){
		
		logger.info("Inside showUserProfile method.");

		ModelAndView mav = new ModelAndView();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String emailId = auth.getName(); //get logged in username
	    logger.info("Fetching profile for EmailId = {}", emailId);
	    
		Profile p = this.profileService.getProfileByEmail(emailId);
		
		if(p != null){
			mav.addObject("p",p);
			mav.setViewName(Constants.VIEW_USER_PROFILE);
		}else{
			mav.setViewName(Constants.VIEW_USER_HOME);
		}
		
		
		return mav;
		
	}
	
	
	@RequestMapping(value = "/profile/edit", method = RequestMethod.GET)
	public ModelAndView showUserProfileEditForm(Model model){
		
		logger.info("Inside showUserProfileEditForm method.");

		ModelAndView mav = new ModelAndView();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String emailId = auth.getName(); //get logged in username
	    logger.info("Fetching profile for EmailId = {}", emailId);
	    
		Profile p = this.profileService.getProfileByEmail(emailId);
		
		if(p != null){
			mav.addObject("p",p);
			mav.setViewName(Constants.VIEW_USER_PROFILE_UPDATE_FORM);
		}else{
			mav.setViewName(Constants.VIEW_USER_HOME);
		}
		
		
		return mav;
		
	}
}
