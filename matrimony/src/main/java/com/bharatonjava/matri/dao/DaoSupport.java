package com.bharatonjava.matri.dao;

public interface DaoSupport {

	
	public default long getProfileId() {
		
		return 0l;
	}
}
