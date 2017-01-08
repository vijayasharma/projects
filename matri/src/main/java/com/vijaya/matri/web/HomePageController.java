package com.vijaya.matri.web;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vijaya.matri.dao.Constants;


@ManagedBean(name="homePageController")
@SessionScoped
public class HomePageController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HomePageController.class);
	
	public HomePageController() {
	}
	
	@PostConstruct
	public void postConstructHandler(){
		LOGGER.info("Inside postConstructHandler method");
	}
	
	public String handleRegisterUserLink(){
		LOGGER.info("Inside handleRegisterUserLink() method");
		return Constants.VIEW_REGISTER_USER;
	}
	
	public String handleHomePageLink(){
		LOGGER.info("Inside handleHomePageLink() method");
		return Constants.VIEW_HOME_PAGE;
	}
}
