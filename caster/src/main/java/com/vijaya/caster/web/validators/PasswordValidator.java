package com.vijaya.caster.web.validators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.vijaya.caster.domain.Profile;

@Component
public class PasswordValidator implements Validator {

	private static final Logger logger = LoggerFactory.getLogger(PasswordValidator.class);
	
	@Override
	public boolean supports(Class<?> registrationDto) {
		return Profile.class.isAssignableFrom(registrationDto);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Profile p = null;
		if (target instanceof Profile) {
			p = (Profile) target;
		}

		
		logger.info("Inside password validator - Password={}, ConfPassword={}", p.getPassword(), p.getConfPassword());
		
		if (p.getPassword() != null && p.getConfPassword() != null) {
			if (! p.getPassword().equals(p.getConfPassword())) {
				logger.info("Validation failed. Passwords do not match");
				errors.rejectValue("password","password", "Passwords do not match");
				errors.rejectValue("confPassword","confPassword", "Passwords do not match");
			}
		} else {
			logger.info("Validation failed. Passwords do not match. Values not provided.");
			errors.rejectValue("password","password", "Passwords do not match");
			errors.rejectValue("confPassword","confPassword", "Passwords do not match");
		}

	}

}
