<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container-fluid">

	<div class="card">
		<div class="card-body bg-light">

			<div class="row bg-light text-secondary text-center">
				<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 col-12">
					&copy; 2017 by Vijaya Sharma. All rights reserved.</div>
			</div>
			<div class="row bg-light text-secondary text-center">
				<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 col-12">

					<spring:url value="/aboutUs" var="aboutUsVar" htmlEscape="true" />
					<spring:url value="/home" var="homeVar" htmlEscape="true" />
					<a href="${homeVar}">Home</a> | <a href="${aboutUsVar}">About
						Us</a> | <a href='<spring:url value="/contactUs"/>'>Contact Us</a> | <a
						href='<spring:url value="/user/register"/>'>Register</a>

				</div>
			</div>
		</div>
	</div>
</div>