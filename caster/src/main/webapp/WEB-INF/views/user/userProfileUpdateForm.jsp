<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>


<div class="container-fluid">
	<div class="page-header">
		<h4>Update Profile</h4>
	</div>
	
	<form:form method="POST" commandName="p" cssClass="form-horizontal">
		<spring:bind path="firstName">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<label class="control-label" for="firstName">Name:</label>
				</div>
				<div class="col-sm-3">
					<form:input path="firstName" value="${firstName}" class="form-control" id="firstName" placeholder="First Name" />
				</div>
				<div class="col-sm-3">
					<form:input path="lastName"  value="${lastName}"  class="form-control" id="lastName" placeholder="Last Name" />
				</div>
				<div class="col-sm-3">
					<form:errors path="firstName" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>
		
				<spring:bind path="gender">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="gender" cssClass="control-label">Gender</form:label>
				</div>
				<div class="col-sm-5">
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
				<div class="col-sm-3">
					<form:label path="dateOfBirth" cssClass="control-label">Date Of Birth</form:label>
				</div>
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
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="email" cssClass="control-label">Email</form:label>
				</div>
				<div class="col-sm-5">
					<form:input path="email" value="${email}" cssClass="form-control"
						placeholder="e.g. email@gmail.com" />
				</div>
				<div class="col-sm-4">
					<form:errors path="email" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="phone">		
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="phone" cssClass="control-label">Mobile Number</form:label>
				</div>
				<div class="col-sm-6">
					<form:input path="phone" value="${phone}" cssClass="form-control" placeholder="10 digit Mobile Number" maxlength="10" />
				</div>
				<div class="col-sm-4">
					<form:errors path="phone" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>		

		<spring:bind path="maritalStatus">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="maritalStatus" cssClass="control-label">Marital Status</form:label>
				</div>
				<div class="col-sm-5">
					<form:select path="maritalStatus" class="btn btn-default btn-sm dropdown-toggle">
						<c:forEach var="m" items="${maritalStatusList}" >
							
							<option id="${m.enumValue}" value="${m.enumValue}" <c:if test="${m.enumValue eq p.maritalStatus}">selected='selected'</c:if> > ${m.enumValue}</option>
						</c:forEach>
					</form:select>
				</div>
				<div class="col-sm-4">
					<form:errors path="maritalStatus" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>
		<div class="form-group">
			<div class="col-sm-3"></div>
			<div class="col-sm-9">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
		
		
	</form:form>
	
	${p}
	<hr/>
	${maritalStatusList }
	
	
</div>