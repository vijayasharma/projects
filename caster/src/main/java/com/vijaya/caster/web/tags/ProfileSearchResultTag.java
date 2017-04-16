package com.vijaya.caster.web.tags;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vijaya.caster.domain.Profile;

public class ProfileSearchResultTag extends TagSupport{
	
	private static final Logger logger = LoggerFactory.getLogger(ProfileSearchResultTag.class);
	
	private static final long serialVersionUID = -5295355807893450298L;
	
	private Profile profile;
	
	public void setProfile(Profile profile) {
		logger.info("Inside tag : profile={}",profile);
		this.profile = profile;
	}

	// constructor
	public ProfileSearchResultTag() {
	}
	
	@Override
	public int doStartTag() throws JspException {
		// logger.info("-------------doStartTag");
		JspWriter out = pageContext.getOut();
		String contextPath = pageContext.getServletContext().getContextPath();
		// InputStream in = pageContext.getServletContext().getClassLoader().getResourceAsStream("WEB-INF/views/user/profileSearchResultTagBody.jsp");
		
		StringBuilder sb = new StringBuilder();
		sb.append("<div class=\"media\" style='outline: 1px solid orange; padding: 5px 5px 5px 5px;'>");
		sb.append("<div class=\"media-left media-top\">");
		
		sb.append("<img src=\""+contextPath+"\\resources\\images\\groom-icon.png\" class=\"media-object\" style=\"width:70px\">");
		sb.append("</div>");
		sb.append("<div class=\"media-body\">");
		sb.append("<h5 class=\"media-heading\">"+profile.getFirstName() +" "+ profile.getLastName()+"</h5>");
		sb.append("<div class='row'>");
		sb.append("<div class='col-sm-3'><strong>Age / Height</strong></div><div class='col-sm-9'>"+profile.getAge()+" , "+profile.getHeight()+"&nbsp;</div>");
		sb.append("<div class='col-sm-3'><strong>Community</strong></div><div class='col-sm-9'>"+ profile.getCommunity() +"&nbsp;</div>");
		sb.append("<div class='col-sm-3'><strong>Sub Community</strong></div><div class='col-sm-9'>"+profile.getSubCommunity()+"&nbsp;</div>");
		sb.append("<div class='col-sm-3'><strong>Mother Tongue</strong></div><div class='col-sm-9'>"+profile.getMotherTongue()+"&nbsp;</div>");
		sb.append("<div class='col-sm-3'><strong>Location</strong></div><div class='col-sm-9'>&nbsp;</div>");
		sb.append("<div class='col-sm-3'><strong>Education</strong></div><div class='col-sm-9'>&nbsp;</div>");
		sb.append("<div class='col-sm-3'><strong>Profession</strong></div><div class='col-sm-9'>&nbsp;</div>");
		sb.append("</div>"); // row ends
		sb.append("</div>");// media body ends
		sb.append("</div>");
		
		try {
			out.write(sb.toString().toCharArray());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	
	@Override
	public int doAfterBody() throws JspException {
		//logger.info("-------------doAfterBody");
		return super.doAfterBody();
	}
	
	@Override
	public int doEndTag() throws JspException {
		//logger.info("-------------doEndTag");
		return super.doEndTag();
	}
	
	
}
