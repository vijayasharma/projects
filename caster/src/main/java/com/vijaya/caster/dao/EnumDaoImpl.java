package com.vijaya.caster.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vijaya.caster.domain.CasterEnum;

@Repository(value = "enumDao")
public class EnumDaoImpl implements EnumDao{

	private static final Logger logger = LoggerFactory.getLogger(EnumDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<CasterEnum> getEnumsByGroup(String enumGroup) {
		String sql = "select enum_id, enum_group, enum_value from caster_enums where enum_group=? order by enum_id, enum_group";
		List<CasterEnum> enums = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<CasterEnum>(CasterEnum.class), new Object[]{enumGroup});
		return enums;
	}
	
}
