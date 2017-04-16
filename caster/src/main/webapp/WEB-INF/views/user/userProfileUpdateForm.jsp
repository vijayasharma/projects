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
	
	<form:hidden path="profileId"/>
	
	<div class="panel panel-default">
  		<div class="panel-heading">Basic Information</div>
		<div class="panel-body">
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

			<spring:bind path="alternatePhone">		
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<div class="col-sm-3">
						<form:label path="alternatePhone" cssClass="control-label">Alternate Mobile Number</form:label>
					</div>
					<div class="col-sm-6">
						<form:input path="alternatePhone" value="${alternatePhone}" cssClass="form-control" placeholder="10 digit Mobile Number" maxlength="10" />
					</div>
					<div class="col-sm-4">
						<form:errors path="alternatePhone" cssClass="text-danger text-left" />
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
								<option id="${m.enumId}" value="${m.enumId}" <c:if test="${m.enumId eq p.height}">selected='selected'</c:if> > ${m.enumValue}</option>
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
					<div class="col-sm-8">
						<div class="radio">
							<c:forEach var="st" items="${skinToneList}">
								<label> <input type="radio" name="skinTone" id="skinTone" value="${st.enumValue}" />${st.enumValue} &nbsp;
								</label>
							</c:forEach>
						</div>
					</div>
					<div class="col-sm-1">
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
								<option id="${m.enumValue}" value="${m.enumValue}" <c:if test="${m.enumValue eq p.bloodGroup}">selected='selected'</c:if> > ${m.enumValue}</option>
							</c:forEach>
						</form:select>
					</div>
					<div class="col-sm-4">
						<form:errors path="bloodGroup" cssClass="text-danger text-left" />
					</div>
				</div>
			</spring:bind>
		</div>
		</div> <!-- Basic information panel ends -->
		
		<div class="panel panel-default">
  			<div class="panel-heading">Religious Background</div>
			<div class="panel-body">
				<spring:bind path="religion">
					<div class="form-group ${status.error ? 'has-error' : ''}">
						<div class="col-sm-3">
							<form:label path="religion" cssClass="control-label">Religion</form:label>
						</div>
						<div class="col-sm-5">
							<form:select path="religion" class="btn btn-default btn-sm dropdown-toggle">
								<c:forEach var="m" items="${religionList}" >
									<option id="${m.enumValue}" value="${m.enumValue}" <c:if test="${m.enumValue eq p.religion}">selected='selected'</c:if> > ${m.enumValue}</option>
								</c:forEach>
							</form:select>
						</div>
						<div class="col-sm-4">
							<form:errors path="religion" cssClass="text-danger text-left" />
						</div>
					</div>
				</spring:bind>
				<spring:bind path="motherTongue">		
					<div class="form-group ${status.error ? 'has-error' : ''}">
						<div class="col-sm-3">
							<form:label path="motherTongue" cssClass="control-label">Mother Tongue</form:label>
						</div>
						<div class="col-sm-6">
							<form:input path="motherTongue" value="${motherTongue}" cssClass="form-control" placeholder="e.g. Hindi" maxlength="100" />
						</div>
						<div class="col-sm-4">
							<form:errors path="motherTongue" cssClass="text-danger text-left" />
						</div>
					</div>
				</spring:bind>
				<spring:bind path="community">		
					<div class="form-group ${status.error ? 'has-error' : ''}">
						<div class="col-sm-3">
							<form:label path="community" cssClass="control-label">Community</form:label>
						</div>
						<div class="col-sm-6">
							<form:input path="community" value="${community}" cssClass="form-control" placeholder="Your community" maxlength="150" />
						</div>
						<div class="col-sm-4">
							<form:errors path="community" cssClass="text-danger text-left" />
						</div>
					</div>
				</spring:bind>
				<spring:bind path="subCommunity">		
					<div class="form-group ${status.error ? 'has-error' : ''}">
						<div class="col-sm-3">
							<form:label path="subCommunity" cssClass="control-label">Sub Community</form:label>
						</div>
						<div class="col-sm-6">
							<form:input path="subCommunity" value="${subCommunity}" cssClass="form-control" placeholder="Your Sub-community if any" maxlength="100" />
						</div>
						<div class="col-sm-4">
							<form:errors path="subCommunity" cssClass="text-danger text-left" />
						</div>
					</div>
				</spring:bind>
				<spring:bind path="gotra">		
					<div class="form-group ${status.error ? 'has-error' : ''}">
						<div class="col-sm-3">
							<form:label path="gotra" cssClass="control-label">Gotra</form:label>
						</div>
						<div class="col-sm-6">
							<form:input path="gotra" value="${gotra}" cssClass="form-control" placeholder="Your Gotra" maxlength="150" />
						</div>
						<div class="col-sm-4">
							<form:errors path="gotra" cssClass="text-danger text-left" />
						</div>
					</div>
				</spring:bind>								
			</div>
		</div> <!-- Religious background panel ends here -->
		
		
		<div class="form-group">
			<div class="col-sm-3"></div>
			<div class="col-sm-9">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
	</form:form>
	
</div>