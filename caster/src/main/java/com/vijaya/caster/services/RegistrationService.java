package com.vijaya.caster.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijaya.caster.dao.ProfileDao;
import com.vijaya.caster.dao.UserDao;
import com.vijaya.caster.domain.Profile;
import com.vijaya.caster.domain.User;

@Service
public class RegistrationService {

	@Autowired
	private ProfileDao profileDao;
	@Autowired
	private UserDao userDao;

	// Default constructor
	public RegistrationService() {
	}

	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public Long saveProfile(Profile profile){
		// save username and password
		User user = new User();
		user.setUserName(profile.getEmail());
		user.setPassword(profile.getPassword());
		user.setEnabled(1);
		int returnStatus = userDao.saveUser(user);
		Long profileReturnStatus = 0L ;
		if(returnStatus == 1){
			profileReturnStatus = profileDao.saveProfile(profile);
		}else{
			// something went wrong while saving username and password;
			
		}
		return profileReturnStatus; 
	}
}
