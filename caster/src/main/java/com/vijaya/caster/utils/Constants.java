package com.vijaya.caster.utils;

public interface Constants {

	String DATE_FORMAT = "dd-MM-yyyy";
	String DATE_FORMAT_SLASHED = "dd/MM/yyyy";

	String ACTION_NEW = "new";
	String ACTION_VIEW = "view";
	String ACTION_EDIT = "edit";
	String ACTION_DELETE = "delete";
	String ACTION_UPDATE = "update";
	String ACTION_INSERT = "insert";
	String ACTION_LIST = "list";

	String PHASE_STAGE = "stage";
	String PHASE_CONFIRM = "confirm";
	String PHASE_CANCEL = "cancel";

	String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	// views
	String VIEW_USER_HOME = "user.home";
	String VIEW_USER_PROFILE = "user.profile";
	String VIEW_USER_PROFILE_UPDATE_FORM = "user.profile.update.form";
	
	
	// enum groups
	String ENUM_MARITAL_STATUS = "MARITAL_STATUS";
	String ENUM_HEIGHT = "HEIGHT";
	String ENUM_BODY_TYPE = "BODY_TYPE";
	String ENUM_SKIN_TONE = "SKIN_TONE";
	String ENUM_BLOOD_GROUP = "BLOOD_GROUP";
	String ENUM_RELIGION = "RELIGION";
	
	// authorities
	String AUTHORITY_ROLE_USER = "ROLE_USER";
	String AUTHORITY_ROLE_ADMIN = "ROLE_ADMIN";
	
}
