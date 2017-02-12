package com.vijaya.caster.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijaya.caster.dao.AuthorityDao;
import com.vijaya.caster.dao.EnumDao;
import com.vijaya.caster.dao.ProfileDao;
import com.vijaya.caster.dao.UserDao;
import com.vijaya.caster.domain.Authority;
import com.vijaya.caster.domain.CasterEnum;
import com.vijaya.caster.domain.Profile;
import com.vijaya.caster.domain.User;

@Service
public class ProfileService {

	@Autowired
	private ProfileDao profileDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private EnumDao enumDao;
	@Autowired
	private AuthorityDao authorityDao;

	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setEnumDao(EnumDao enumDao) {
		this.enumDao = enumDao;
	}

	public void setAuthorityDao(AuthorityDao authorityDao) {
		this.authorityDao = authorityDao;
	}

	@Transactional
	public Profile getProfileById(Long profileId) {

		return profileDao.getProfileById(profileId);
	}

	@Transactional
	public Profile getProfileByEmail(String emailId) {

		return profileDao.getProfileByEmail(emailId);
	}

	@Transactional
	public int updateProfile(Profile profile) {
		return profileDao.updateProfile(profile);
	}

	@Transactional
	public List<CasterEnum> getEnumsByGroup(String enumGroup) {
		return this.enumDao.getEnumsByGroup(enumGroup);
	}

	@Transactional
	public int saveUser(User user) {
		return this.userDao.saveUser(user);
	}

	@Transactional
	public int createAuthority(Authority authority) {
		return authorityDao.createAuthority(authority);
	}

	@Transactional
	public Long saveProfileForRegistration(Profile profile) {

		Long profileReturnStatus = 0L;
		profileReturnStatus = profileDao.saveProfile(profile);
		return profileReturnStatus;
	}
}