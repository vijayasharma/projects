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
	
		<div class="panel panel-default">
  			<div class="panel-heading text-left">Basic Information <a href='<c:url value="/user/profile/edit"/>' class="btn btn-xs btn-primary pull-right">Edit Profile</a></div>
  			<div class="panel-body">

				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Name:</label>
					</div>
					<div class="col-sm-8">
						${p.firstName} ${p.lastName}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Gender:</label>
					</div>
					<div class="col-sm-8">
						${p.gender}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Date of Birth:</label>
					</div>
					<div class="col-sm-8">
						<fmt:formatDate value="${p.dateOfBirth}" var="dateString" pattern="dd-MMM-yyyy" />
						${dateString} <span class="badge">Age - ${p.age} years</span>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Marital Status</label>
					</div>
					<div class="col-sm-8">
						${p.maritalStatus}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Height</label>
					</div>
					<div class="col-sm-8">
						${p.height}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Body Type</label>
					</div>
					<div class="col-sm-8">
						${p.bodyType}
					</div>
				</div>				 				
  				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Weight</label>
					</div>
					<div class="col-sm-8">
						${p.weight} <span>Kgs</span>
					</div>
				</div>	
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Health Information</label>
					</div>
					<div class="col-sm-8">
						${p.healthInformation}
					</div>
				</div>	  			
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Skin Tone</label>
					</div>
					<div class="col-sm-8">
						${p.skinTone}
					</div>
				</div>	  	  		
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Blood Group</label>
					</div>
					<div class="col-sm-8">
						${p.bloodGroup}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Disablility</label>
					</div>
					<div class="col-sm-8">
						${p.disablility}
					</div>
				</div>
								
  			</div> <!-- Panel body ends -->
  			<div class="panel-footer text-right">
  				<a href='<c:url value="/user/profile/edit"/>' class="btn btn-xs btn-primary">Edit Profile</a>
  			</div>
		</div>
		
		<%-- Religious Background --%>
		<div class="panel panel-default">
  			<div class="panel-heading text-left">Religious Background <a href='<c:url value="/user/profile/edit"/>' class="btn btn-xs btn-primary pull-right">Edit Profile</a></div>
  			<div class="panel-body">

				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Religion</label>
					</div>
					<div class="col-sm-8">
						${p.religion}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Mother Tongue</label>
					</div>
					<div class="col-sm-8">
						${p.motherTongue}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Community</label>
					</div>
					<div class="col-sm-8">
						${p.community}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Sub Community</label>
					</div>
					<div class="col-sm-8">
						${p.subCommunity}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="control-label">Gotra</label>
					</div>
					<div class="col-sm-8">
						${p.gotra}
					</div>
				</div>
								
  			</div> <!-- Panel body ends -->
  			<div class="panel-footer text-right">
  				<a href='<c:url value="/user/profile/edit"/>' class="btn btn-xs btn-primary">Edit Profile</a>
  			</div>
		</div>
		
		
	</div> <!-- Container ends -->
</div>

