package com.vijaya.caster.web.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vijaya.caster.domain.Profile;

public class ProfileSearchResultTag extends TagSupport{
	
	private static final Logger logger = LoggerFactory.getLogger(ProfileSearchResultTag.class);
	
	private static final long serialVersionUID = -5295355807893450298L;
	
	private Profile profile;
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	// constructor
	public ProfileSearchResultTag() {
	}
	
	@Override
	public int doStartTag() throws JspException {
		logger.info("-------------doStartTag");
		return super.doStartTag();
	}
	
	@Override
	public int doAfterBody() throws JspException {
		logger.info("-------------doAfterBody");
		return super.doAfterBody();
	}
	
	@Override
	public int doEndTag() throws JspException {
		logger.info("-------------doEndTag");
		return super.doEndTag();
	}
	
	
}
