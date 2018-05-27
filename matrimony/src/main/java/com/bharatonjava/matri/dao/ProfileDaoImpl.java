package com.bharatonjava.matri.dao;

import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bharatonjava.matri.domain.Profile;


@Repository
public class ProfileDaoImpl implements ProfileDao{
	
	private static final Logger logger = LoggerFactory.getLogger(ProfileDaoImpl.class);
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public ProfileDaoImpl() {
	}
	
	@Override
	public void saveProfile(Profile profile) {
		logger.info("Inside dao method to save profile: {}", profile);
		this.mongoTemplate.save(profile);
		
	}

	@Override
	public Profile getProfileById(Long profileId) {
		this.mongoTemplate.findOne(Query.query(Criteria.where("profileId").is(profileId)), Profile.class);
		return null;
	}

	@Override
	public List<Profile> getAllProfiles() {
		List<Profile> profiles = this.mongoTemplate.findAll(Profile.class);
		return profiles;
	}

	@Override
	public void deleteProfile(Long profileId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void udpateProfile(Profile profile) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
