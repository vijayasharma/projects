package com.bharatonjava.matri.domain;

import java.time.LocalDate;

public class Person {

	private String firstName;
	private String middleName;
	private String lastName;
	private LocalDate dob;
	private String fatherName;
	private String motherName;
	private MaritalStatus maritalStatus;
	private String email;
	private String mobile;
	private String alerternateMobile;
	private int height;
	private int weight;
	private String placeOfBirth;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAlerternateMobile() {
		return alerternateMobile;
	}
	public void setAlerternateMobile(String alerternateMobile) {
		this.alerternateMobile = alerternateMobile;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", dob="
				+ dob + ", fatherName=" + fatherName + ", motherName=" + motherName + ", maritalStatus=" + maritalStatus
				+ ", email=" + email + ", mobile=" + mobile + ", alerternateMobile=" + alerternateMobile + ", height="
				+ height + ", weight=" + weight + ", placeOfBirth=" + placeOfBirth + "]";
	}
}
