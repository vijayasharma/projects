package com.vijaya.caster.domain;

public class Address {

	private Long addressId;
	private String apartment;
	private String street;
	private String area;
	private String city;

	
	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	
	
	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", apartment=" + apartment + ", street=" + street + ", area="
				+ area + ", city=" + city + "]";
	}
}
