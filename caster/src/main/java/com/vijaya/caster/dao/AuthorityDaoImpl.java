package com.vijaya.caster.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.vijaya.caster.domain.Authority;

@Repository(value = "authoritiesDao")
public class AuthorityDaoImpl implements AuthorityDao{

	private static final Logger logger = LoggerFactory.getLogger(AuthorityDaoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int createAuthority(Authority authority) {
		String sql = "INSERT INTO AUTHORITIES (USERNAME, AUTHORITY) values (?,?)";
		int count = this.jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, authority.getUsername());
				ps.setString(2, authority.getAuthority());
				return ps;
			}
		});
		return count;
	}

	@Override
	public List<Authority> getAuthoritiesForUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
