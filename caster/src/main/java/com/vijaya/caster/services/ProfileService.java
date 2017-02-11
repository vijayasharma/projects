package com.vijaya.caster.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijaya.caster.dao.EnumDao;
import com.vijaya.caster.dao.ProfileDao;
import com.vijaya.caster.dao.UserDao;
import com.vijaya.caster.domain.CasterEnum;
import com.vijaya.caster.domain.Profile;

@Service
public class ProfileService {

	@Autowired
	private ProfileDao profileDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private EnumDao enumDao;
	
	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void setEnumDao(EnumDao enumDao) {
		this.enumDao = enumDao;
	}
	
	@Transactional
	public Profile getProfileById(Long profileId){

		return profileDao.getProfileById(profileId) ;
	}
	
	@Transactional
	public Profile getProfileByEmail(String emailId){

		return profileDao.getProfileByEmail(emailId) ;
	}
	
	@Transactional
	public int updateProfile(Profile profile){
		return profileDao.updateProfile(profile);
	}
	
	
	@Transactional
	public List<CasterEnum> getEnumsByGroup(String enumGroup){
		return this.enumDao.getEnumsByGroup(enumGroup);
	}
}
