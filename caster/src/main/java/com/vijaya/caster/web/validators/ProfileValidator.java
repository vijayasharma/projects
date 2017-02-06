package com.vijaya.caster.web.validators;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vijaya.caster.domain.Profile;
import com.vijaya.caster.utils.Constants;

@Component
public class ProfileValidator implements Validator {

	private static final Logger logger = LoggerFactory.getLogger(ProfileValidator.class);

	private Pattern pattern;
	private Matcher matcher;

	@Override
	public boolean supports(Class<?> profile) {
		return Profile.class.isAssignableFrom(profile);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Profile p = null;
		if (target instanceof Profile) {
			p = (Profile) target;
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "fieldIsRequired", "First Name is required.");

		if (p.getGender() == null || !(p.getGender().equals("Male") || p.getGender().equals("Female"))) {
			errors.rejectValue("gender", "gender.required", "Please select Gender");
		}

		if (p.getDateOfBirth() == null) {
			errors.rejectValue("dateOfBirth", "dateOfBirth.null", "Date of Birth is required.");
		} else if (p.getDateOfBirth().after(new Date())) {
			errors.rejectValue("dateOfBirth", "dateOfBirth.future", "Date of Birth should be in the past.");
		}

		if (p.getPhone() != null && p.getPhone().trim().length() != 0) {
			if (p.getPhone().length() != 10) {
				errors.rejectValue("phone", "phone.invalid", "Mobile number should be 10 digit");
			}
		}else{
			errors.rejectValue("phone", "phone.required", "Mobile number is Required");
		}

		// email validation in spring
		if (!(p.getEmail() != null && p.getEmail().isEmpty())) {
			logger.info("inside email validation if condition");
			pattern = Pattern.compile(Constants.EMAIL_PATTERN);
			matcher = pattern.matcher(p.getEmail());
			if (!matcher.matches()) {
				errors.rejectValue("email", "email.incorrect", "Enter a correct email");
				logger.info("Email is incorrect: " + p.getEmail());
			}
		} else {
			logger.info("inside email validation else condition");
			errors.rejectValue("email","email.incorrect", "Email is required");
		}

	}
}
