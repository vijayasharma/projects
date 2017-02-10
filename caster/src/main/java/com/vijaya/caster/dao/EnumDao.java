package com.vijaya.caster.dao;

import java.util.List;

import com.vijaya.caster.domain.CasterEnum;

public interface EnumDao {

	public List<CasterEnum> getEnumsByGroup(String enumGroup);
}
