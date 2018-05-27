<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container-fluid">
	<div class="row">
		<div class="col-sm-8">
			<div class="thumbnail">
				<img src='<spring:url value="/resources/images/marriage.png"/>'
					alt="Marriage" style="width: 100%">
				<div class="caption"></div>
			</div>
		</div>
		<div class="col-sm-4">
			<%@ include file="/WEB-INF/views/common/login-form.jsp"%>
		</div>
	</div>
</div>