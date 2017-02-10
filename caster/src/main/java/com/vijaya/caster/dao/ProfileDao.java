package com.vijaya.caster.dao;

import com.vijaya.caster.domain.Profile;

public interface ProfileDao {

	public Long saveProfile(Profile profile);
	public Profile getProfileById(Long profileId);
	public Profile getProfileByEmail(String emailId);
	public int updateProfile(Profile profile);
	public int deleteProfile(Long profileId);
}
