package com.vijaya.caster.dao;

import java.util.List;

import com.vijaya.caster.domain.Profile;

public interface ProfileDao {

	public Long saveProfile(Profile profile);
	public Profile getProfileById(Long profileId);
	public Profile getProfileByEmail(String emailId);
	public int updateProfile(Profile profile);
	public int deleteProfile(Long profileId);
	public List<Profile> searchProfiles(String criteria);
}
