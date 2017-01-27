package com.vijaya.caster.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value={"/","/home"})
	public ModelAndView showHomePage(Model model){
		logger.info("Inside showHomePage method.");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("homePage");
		return mav;
	}
	
	@RequestMapping(value={"aboutUs", "aboutus", "about"})
	public ModelAndView showAboutUsPage(Model model){
		logger.info("Inside showAboutUsPage method.");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("aboutUs");
		return mav;
	}
	
	@RequestMapping(value={"contactUs", "contactus", "contact"})
	public ModelAndView showContactUsPage(Model model){
		logger.info("Inside showContactUsPage method.");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("contactUs");
		return mav;
	}
}
