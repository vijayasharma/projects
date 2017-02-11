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
		
		<spring:bind path="height">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="height" cssClass="control-label">Height</form:label>
				</div>
				<div class="col-sm-5">
					<form:select path="height" class="btn btn-default btn-sm dropdown-toggle">
						<c:forEach var="m" items="${heightList}" >
							<option id="${m.enumValue}" value="${m.enumValue}" <c:if test="${m.enumValue eq p.height}">selected='selected'</c:if> > ${m.enumValue}</option>
						</c:forEach>
					</form:select>
				</div>
				<div class="col-sm-4">
					<form:errors path="height" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="bodyType">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="bodyType" cssClass="control-label">Body Type</form:label>
				</div>
				<div class="col-sm-5">
					<form:select path="bodyType" class="btn btn-default btn-sm dropdown-toggle">
						<c:forEach var="m" items="${bodyTypeList}" >
							<option id="${m.enumValue}" value="${m.enumValue}" <c:if test="${m.enumValue eq p.bodyType}">selected='selected'</c:if> > ${m.enumValue}</option>
						</c:forEach>
					</form:select>
				</div>
				<div class="col-sm-4">
					<form:errors path="bodyType" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="weight">		
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="weight" cssClass="control-label">Weight (Kg)</form:label>
				</div>
				<div class="col-sm-6">
					<form:input path="weight" value="${weight}" cssClass="form-control" placeholder="e.g. 65" maxlength="3" />
				</div>
				<div class="col-sm-4">
					<form:errors path="weight" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="healthInformation">		
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="healthInformation" cssClass="control-label">Health Information</form:label>
				</div>
				<div class="col-sm-6">
					<form:textarea path="healthInformation" value="${healthInformation}" cssClass="form-control" placeholder="Any medical problems etc.." maxlength="100" />
				</div>
				<div class="col-sm-4">
					<form:errors path="healthInformation" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>		

		<spring:bind path="skinTone">		
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="skinTone" cssClass="control-label">Skin Tone</form:label>
				</div>
				<div class="col-sm-6">
					<div class="radio">
						<c:forEach var="st" items="${skinToneList}">
							<label> <input type="radio" name="skinTone" id="skinTone" value="${st.enumValue}" />${st.enumValue} &nbsp;
							</label>
						</c:forEach>
					</div>
				</div>
				<div class="col-sm-4">
					<form:errors path="skinTone" cssClass="text-danger text-left" />
				</div>
			</div>
		</spring:bind>	

		<spring:bind path="bloodGroup">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<div class="col-sm-3">
					<form:label path="bloodGroup" cssClass="control-label">Blood Group</form:label>
				</div>
				<div class="col-sm-5">
					<form:select path="bloodGroup" class="btn btn-default btn-sm dropdown-toggle">
						<c:forEach var="m" items="${bloodGroupList}" >
							<option id="${m.enumValue}" value="${m.enumValue}" <c:if test="${m.enumValue eq p.bodyType}">selected='selected'</c:if> > ${m.enumValue}</option>
						</c:forEach>
					</form:select>
				</div>
				<div class="col-sm-4">
					<form:errors path="bloodGroup" cssClass="text-danger text-left" />
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