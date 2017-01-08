package com.vijaya.matri.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.vijaya.matri.domain.Registration;
import com.vijaya.matri.service.RegistrationService;

@ManagedBean
@SessionScoped
public class RegisterUser {

	
	private Registration registration;
	
	@ManagedProperty("#{registrationService}")
	private RegistrationService registrationService;
	
	public RegisterUser() {}
	
	public Registration getRegistration() {
		return registration;
	}
	
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	
	public RegistrationService getRegistrationService() {
		return registrationService;
	}
	
	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}
	
}
