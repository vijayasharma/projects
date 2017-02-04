package com.vijaya.caster.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {

	@RequestMapping(path = "/error")
	public ModelAndView handle(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.addObject("status", request.getAttribute("javax.servlet.error.status_code"));
		mav.addObject("reason", request.getAttribute("javax.servlet.error.message"));

		mav.setViewName("error");
		return mav;
	}

}
