package com.vijaya.caster.domain;

public class RegistrationDto {

	private Profile profile;
	private String newPassword;
	private String confPassword;

	public RegistrationDto() {
		profile = new Profile();
	}

	public RegistrationDto(Profile profile) {
		if (profile == null) {
			profile = new Profile();
		} else {
			this.profile = profile;
		}
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfPassword() {
		return confPassword;
	}
	
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}

	@Override
	public String toString() {
		return "RegistrationDto [profile=" + profile + ", newPassword=" + newPassword + ", confPassword=" + confPassword
				+ "]";
	}

}
