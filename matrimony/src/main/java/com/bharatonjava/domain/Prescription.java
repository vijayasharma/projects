package com.bharatonjava.domain;

import java.time.LocalDateTime;

public class Prescription {

	private String prescription;
	private LocalDateTime time;
	private String doctorName;
	
	public Prescription(String prescription, LocalDateTime time, String doctorName) {
		super();
		this.prescription = prescription;
		this.time = time;
		this.doctorName = doctorName;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	@Override
	public String toString() {
		return "Prescription [prescription=" + prescription + ", time=" + time + ", doctorName=" + doctorName + "]";
	}

}
