package com.bharatonjava.matri.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(path="/", method = RequestMethod.GET)
	public ModelAndView showHomePage(ModelAndView mav1) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("matri/defaultHome");
		return mav;
	}
}
