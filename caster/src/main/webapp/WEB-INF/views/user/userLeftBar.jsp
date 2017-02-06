<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<img src="<spring:url value="/resources/images/groom-icon.png"/>" class="img-thumbnail" alt="Groom" width="300" height="250">
		</div>
		<div class="col-xs-12"><a href='<c:url value="/user/profile/edit"/>'>Edit Profile</a></div>
		<div class="col-xs-12"><a href='<c:url value="/user/profile/edit"/>'>Edit Profile</a></div>
		<div class="col-xs-12"><a href='<c:url value="/user/profile/edit"/>'>Edit Profile</a></div>
	</div>
</div>