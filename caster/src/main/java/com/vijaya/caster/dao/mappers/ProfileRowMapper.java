package com.vijaya.caster.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vijaya.caster.domain.Profile;

public class ProfileRowMapper implements RowMapper<Profile>{

	@Override
	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Profile p = new Profile();
		p.setProfileId(rs.getLong("PROFILE_ID"));
		p.setFirstName(rs.getString("FIRST_NAME"));
		p.setLastName(rs.getString("LAST_NAME"));
		p.setDateOfBirth(rs.getDate("DATE_OF_BIRTH"));
		p.setMaritalStatus(rs.getString("MARITAL_STATUS"));
		p.setHeight(rs.getInt("HEIGHT"));
		p.setBodyType(rs.getString("BODY_TYPE"));
		p.setWeight(rs.getInt("WEIGHT"));
		p.setHealthInformation(rs.getString("HEALTH_INFORMATION"));
		p.setSkinTone(rs.getString("SKIN_TONE"));
		p.setDisablility(rs.getString("DISABILITY"));
		p.setBloodGroup(rs.getString("BLOOD_GROUP"));
		p.setReligion(rs.getString("RELIGION"));
		p.setMotherTongue(rs.getString("MOTHER_TONGUE"));
		p.setCommunity(rs.getString("COMMUNITY"));
		p.setSubCommunity(rs.getString("SUB_COMMUNITY"));
		p.setGotra(rs.getString("GOTRA"));
		p.setGender(rs.getString("GENDER"));
		p.setEmail(rs.getString("EMAIL"));
		p.setPhone(rs.getString("PHONE"));
		p.setAlternatePhone(rs.getString("ALTERNATE_PHONE"));
		
		return p;
	}

	
}
