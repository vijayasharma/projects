<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="panel panel-danger">
	<div class="panel-heading">
		<span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>
		Error!
	</div>
	<div class="panel-body">${errorMessage}</div>
	<div class="panel-footer text-right">
		<a href='<c:url value="/contactUs"/>' class="btn btn-xs btn-primary">Contact Support</a>
	</div>
</div>