<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<div class="container-fluid">
	<div class="page-header">
		<h4><c:if test="${p.firstName ne null}">${p.firstName}'s Profile</c:if></h4>
	</div>
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<a href='<c:url value="/user/profile/edit"/>' class="btn btn-xs btn-primary">Edit Profile</a>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<label class="control-label">Name:</label>
			</div>
			<div class="col-sm-9">
				${p.firstName} ${p.lastName}
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<label class="control-label">Gender:</label>
			</div>
			<div class="col-sm-9">
				${p.gender}
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<label class="control-label">Date of Birth:</label>
			</div>
			<div class="col-sm-9">
				<fmt:formatDate value="${p.dateOfBirth}" var="dateString" pattern="dd-MMM-yyyy" />
				${dateString} <span class="badge">Age - ${p.age} years</span>
			</div>
		</div>
	</div>
</div>

${p}