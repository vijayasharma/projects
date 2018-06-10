package com.vijaya.caster.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vijaya.caster.domain.Profile;

@RestController
public class SearchController {

	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);
		
	@RequestMapping(value="/search")
	public List<Profile> search(@RequestParam("q") String query){
		
		List<Profile> list = new ArrayList<>();
		
		Profile p = new Profile();
		p.setFirstName("Aayti");
		p.setLastName("Arora");
		list.add(p);
		return list;
		
	}
}
