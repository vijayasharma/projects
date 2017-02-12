package com.vijaya.caster.dao;

import java.util.List;

import com.vijaya.caster.domain.Authority;

public interface AuthorityDao {

	public int createAuthority(Authority authority);
	public List<Authority> getAuthoritiesForUser(String userName);
	
}
