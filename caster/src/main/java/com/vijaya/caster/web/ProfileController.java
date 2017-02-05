package com.vijaya.caster.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

	@RequestMapping(value = "/user/home", method = RequestMethod.GET)
	public ModelAndView showUserHome(Model model) {
		
		logger.info("Inside showUserHome method.");

		ModelAndView mav = new ModelAndView();

		mav.setViewName("user.home");
		return mav;
	}
}
