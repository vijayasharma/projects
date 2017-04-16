package com.vijaya.caster.domain;

import java.util.Calendar;
import java.util.Date;

public class Profile {

	private Long profileId;
	private String username;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	private String maritalStatus;
	private int height;
	private String bodyType;
	private int weight;
	private String healthInformation;
	private String skinTone;
	private String disablility;
	private String bloodGroup;

	// Religious Background
	private String religion;
	private String motherTongue;
	private String community;
	private String subCommunity;
	private String gotra;

	// Family

	// Astro details

	// Education and career

	// Lifestyle

	// contact info
	private String email;
	private String password;
	private String confPassword;
	private String phone;
	private String alternatePhone;

	// address
	private Address address;

	public Profile() {
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
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

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getHealthInformation() {
		return healthInformation;
	}

	public void setHealthInformation(String healthInformation) {
		this.healthInformation = healthInformation;
	}

	public String getSkinTone() {
		return skinTone;
	}

	public void setSkinTone(String skinTone) {
		this.skinTone = skinTone;
	}

	public String getDisablility() {
		return disablility;
	}

	public void setDisablility(String disablility) {
		this.disablility = disablility;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getSubCommunity() {
		return subCommunity;
	}

	public void setSubCommunity(String subCommunity) {
		this.subCommunity = subCommunity;
	}

	public String getGotra() {
		return gotra;
	}

	public void setGotra(String gotra) {
		this.gotra = gotra;
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

	public int getAge() {

		Date d = this.getDateOfBirth();
		int age = 0;

		if (d != null) {

			Calendar dob = Calendar.getInstance();
			dob.setTime(d);
			Calendar today = Calendar.getInstance();

			age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
			if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
				age--;
			} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
					&& today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
				age--;
			}
		}

		return age;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", maritalStatus=" + maritalStatus
				+ ", height=" + height + ", bodyType=" + bodyType + ", weight=" + weight + ", healthInformation="
				+ healthInformation + ", skinTone=" + skinTone + ", disablility=" + disablility + ", bloodGroup="
				+ bloodGroup + ", religion=" + religion + ", motherTongue=" + motherTongue + ", community=" + community
				+ ", subCommunity=" + subCommunity + ", gotra=" + gotra + ", email=" + email + ", password=" + password
				+ ", confPassword=" + confPassword + ", phone=" + phone + ", alternatePhone=" + alternatePhone
				+ ", address=" + address + "]";
	}

}
