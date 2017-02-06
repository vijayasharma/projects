package com.vijaya.caster.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijaya.caster.dao.ProfileDao;
import com.vijaya.caster.domain.Profile;

@Service
public class ProfileService {

	@Autowired
	private ProfileDao profileDao;
	
	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}
	
	@Transactional
	public Profile getProfileById(Long profileId){
		return profileDao.getProfileById(profileId) ;
	}
}
