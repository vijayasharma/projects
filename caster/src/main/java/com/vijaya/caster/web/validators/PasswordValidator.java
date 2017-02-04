package com.vijaya.caster.web.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.vijaya.caster.domain.Profile;
import com.vijaya.caster.domain.RegistrationDto;

@Component
public class PasswordValidator implements Validator {

	@Override
	public boolean supports(Class<?> registrationDto) {
		return RegistrationDto.class.isAssignableFrom(registrationDto);
	}

	@Override
	public void validate(Object target, Errors errors) {

		RegistrationDto r = null;
		if (target instanceof RegistrationDto) {
			r = (RegistrationDto) target;
		}

		if (r.getNewPassword() != null && r.getConfPassword() != null) {
			if (! r.getNewPassword().equals(r.getConfPassword())) {
				errors.rejectValue("newPassword", "Passwords do not match");
				errors.rejectValue("confPassword", "Passwords do not match");
			}
		} else {
			errors.rejectValue("newPassword", "Passwords do not match");
			errors.rejectValue("confPassword", "Passwords do not match");
		}

	}

}
