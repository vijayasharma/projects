<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<script>
	function formSubmit() {
		document.getElementById("logoutForm").submit();
	}
</script>

<c:url value="/j_spring_security_logout" var="logoutUrl" />
<!-- csrt for log out-->
<form action="${logoutUrl}" method="post" id="logoutForm">
  <input type="hidden"
	name="${_csrf.parameterName}"
	value="${_csrf.token}" />
</form>

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="<c:url value="/"/>">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href='<c:url value="/user/home"/>'>Home</a></li>
      <li><a href='<c:url value="/user/profile"/>'>Profile</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
		<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Actions<span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href='<c:url value="/aboutUs"/>'>About Us</a></li>
				<li><a href='<c:url value="/contactUs"/>'>Contact Us</a></li>
				<li><a href='<c:url value="/disclaimer"/>'>Disclaimer</a></li>
				<li><a href='<c:url value="/j_spring_security_logout" />'>Logout</a></li>
			</ul>
		</li>
      	<li><a href="#"><span><security:authorize access="isAuthenticated()">
      		Welcome  <security:authentication property="principal.username"/>
      	</security:authorize></span></a></li>
    </ul>
  </div>
</nav>