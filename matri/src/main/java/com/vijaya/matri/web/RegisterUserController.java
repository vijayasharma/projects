package com.vijaya.matri.web;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vijaya.matri.domain.User;
import com.vijaya.matri.service.RegistrationService;

@ManagedBean(name="regController")
@SessionScoped
public class RegisterUserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RegisterUserController.class);
	private User user;
	
	@ManagedProperty("#{registrationService}")
	private RegistrationService registrationService;
	
	public RegisterUserController() {}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public RegistrationService getRegistrationService() {
		return registrationService;
	}
	
	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}
	
	@PostConstruct
	public void postConstructHandler(){
		LOGGER.info("Inside postConstructHandler method");
		prepareUserRegistrationForm();
	}
	
	public String prepareUserRegistrationForm(){
		if(user == null){
			user = new User();
		}
		return null;
	}
	
	public String processUserRegistrationForm(){
		LOGGER.info("inside processUserRegistrationForm method");
		LOGGER.info("User={}", this.user);
		return null;
	}
}
