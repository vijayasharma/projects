package com.vijaya.caster.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.vijaya.caster.domain.User;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao{

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int saveUser(User user){
		
		String sql= "INSERT INTO USERS (USERNAME, PASSWORD, ENABLED) VALUES (?,?,?)";
		int count = 0;
		try{
		count = this.jdbcTemplate.update( new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getPassword());
				ps.setInt(3, user.getEnabled());
				return ps;
			}
		}); 
		}catch(DuplicateKeyException e){
			
		}
		return count;
	}
}
