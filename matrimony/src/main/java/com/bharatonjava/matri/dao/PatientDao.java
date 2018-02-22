package com.bharatonjava.matri.dao;

import java.util.List;

import com.bharatonjava.matri.domain.Profile;

public interface PatientDao {

	public void saveProfile(Profile profile);

	public Profile getProfileById(Long profileId);

	public List<Profile> getAllProfiles();

	public void deleteProfile(Long profileId);

	public void udpateProfile(Profile profile);
}
