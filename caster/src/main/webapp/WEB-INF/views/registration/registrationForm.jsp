<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">

<div class="page-header">
	<h3>New User Registration</h3>
</div>
	
<form:form method="POST" commandName="profile" cssClass="form-horizontal">

		<spring:bind path="firstName">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label col-sm-2" for="email">Name:</label>
				<div class="col-sm-3">
					<form:input path="firstName" value="${firstName}" class="form-control" id="firstName" placeholder="First Name" />
				</div>
				<div class="col-sm-3">
					<form:input path="lastName"  value="${lastName}"  class="form-control" id="lastName" placeholder="Last Name" />
				</div>
				<div class="col-sm-4">
					<form:errors path="firstName" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>


		<spring:bind path="gender">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:label path="gender" cssClass="col-sm-2 control-label">Gender</form:label>
				<div class="col-sm-6">
					<label class="radio-inline"> <form:radiobutton path="gender" value="Male" /> Male</label>
					<label class="radio-inline"> <form:radiobutton path="gender" value="Female" /> Female</label>
				</div>
				<div class="col-sm-4">
					<form:errors path="gender" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>


		<spring:bind path="dateOfBirth">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:label path="dateOfBirth" cssClass="col-sm-2 control-label">Date Of Birth</form:label>
				<div class="col-sm-6">
					<fmt:formatDate value="${dateOfBirth}" var="dateString" pattern="dd/MM/yyyy" />
					<form:input path="dateOfBirth" value="${dateString}" cssClass="form-control" placeholder="dd/MM/yyyy" />
				</div>
				<div class="col-sm-4">
					<form:errors path="dateOfBirth" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="email">
			<div class="form-group">
				<form:label path="email" cssClass="col-sm-2 control-label">Email</form:label>
				<div class="col-sm-6">
					<form:input path="email" value="${email}" cssClass="form-control"
						placeholder="e.g. email@gmail.com" />
				</div>
				<div class="col-sm-4">
					<form:errors path="email" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>
		
		
		<spring:bind path="phone">		
			<div class="form-group">
				<form:label path="phone" cssClass="col-sm-2 control-label">Mobile Number</form:label>
				<div class="col-sm-6">
					<form:input path="phone" value="${phone}" cssClass="form-control" placeholder="Mobile Number" maxlength="10" />
				</div>
				<div class="col-sm-4">
					<form:errors path="phone" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>		


		

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-6">
				<div class="checkbox">
					<label><input type="checkbox">Agree to terms and conditions of this website</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-6">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
		
	</form:form>
</div>