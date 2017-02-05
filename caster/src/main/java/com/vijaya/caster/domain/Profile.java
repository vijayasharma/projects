package com.vijaya.caster.domain;

import java.util.Date;

public class Profile {

	private Integer profileId;
	private String username;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	private String subCaste;
	private String email;
	private String password;
	private String confPassword;
	private String phone;
	private String alternatePhone;
	private Address address;
	
	public Profile() {
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getSubCaste() {
		return subCaste;
	}
	
	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfPassword() {
		return confPassword;
	}
	
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAlternatePhone() {
		return alternatePhone;
	}
	
	public void setAlternatePhone(String alternatePhone) {
		this.alternatePhone = alternatePhone;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", subCaste=" + subCaste
				+ ", email=" + email + ", password=" + password + ", confPassword=" + confPassword + ", phone=" + phone
				+ ", alternatePhone=" + alternatePhone + ", address=" + address + "]";
	}
	
}
