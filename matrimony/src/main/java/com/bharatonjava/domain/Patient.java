package com.bharatonjava.domain;

import java.util.ArrayList;
import java.util.List;

public class Patient {

	private String firstName;
	private String lastName;
	private List<Prescription> prescriptions;
	
	
	public Patient() {
		super();
		if (prescriptions == null) {
			prescriptions = new ArrayList<>();
		}
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

	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}
	
	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", prescriptions=" + prescriptions + "]";
	}
	
	
}
