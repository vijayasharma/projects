package com.bharatonjava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/search")
public class SearchController {

	
	@RequestMapping(path="/advanced", method = RequestMethod.GET)
	public ModelAndView advancedSearch() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("matri/search");
		return mav;
	}
	
	@RequestMapping(path="/id", method = RequestMethod.GET)
	public ModelAndView searchById() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("matri/search");
		return mav;
	}
}
