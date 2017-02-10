package com.vijaya.caster.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijaya.caster.dao.ProfileDao;
import com.vijaya.caster.dao.UserDao;
import com.vijaya.caster.domain.Profile;

@Service
public class ProfileService {

	@Autowired
	private ProfileDao profileDao;
	@Autowired
	private UserDao userDao;
	
	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Transactional
	public Profile getProfileById(Long profileId){

		return profileDao.getProfileById(profileId) ;
	}
	
	@Transactional
	public Profile getProfileByEmail(String emailId){

		return profileDao.getProfileByEmail(emailId) ;
	}
	
	
}
