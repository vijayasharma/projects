package com.vijaya.caster.domain;

public class CasterEnum {

	private int enumId;
	private String enumGroup;
	private String enumValue;

	public CasterEnum() {
	}

	public int getEnumId() {
		return enumId;
	}

	public void setEnumId(int enumId) {
		this.enumId = enumId;
	}

	public String getEnumGroup() {
		return enumGroup;
	}

	public void setEnumGroup(String enumGroup) {
		this.enumGroup = enumGroup;
	}

	public String getEnumValue() {
		return enumValue;
	}

	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}

	@Override
	public String toString() {
		return "CasterEnum [enumId=" + enumId + ", enumGroup=" + enumGroup + ", enumValue=" + enumValue + "]";
	}
	
}
