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
		p.setGender(rs.getString("GENDER"));
		p.setEmail(rs.getString("EMAIL"));
		p.setPhone(rs.getString("PHONE"));
		p.setAlternatePhone(rs.getString("ALTERNATE_PHONE"));
		p.setMaritalStatus(rs.getString("MARITAL_STATUS"));
		
		return p;
	}

	
}
