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
			<div class="panel panel-default">

				<div class="col-md-12">
					<div class="row">
						<c:if test="${not empty error}">
							<div class="bg-danger well-sm">${error}</div>
						</c:if>
						<c:if test="${not empty msg}">
							<div class="bg-info well-sm">${msg}</div>
						</c:if>
					</div>
					<div style="height: 20px;"></div>
					<div class="row well">
						<form name='loginForm'
							action="<c:url value='j_spring_security_check' />" method='POST'>
												  		
							<div>
								<h4>Login Please...</h4>
								<input type="text" id="userName"
									class="form-control input-sm chat-input" name="username"
									placeholder="username" /> <br /> <input type="password"
									name="password" class="form-control input-sm chat-input"
									placeholder="password" /> <br>
								<div class="wrapper">
									<span class="group-btn"> <input name="submit"
										type="submit" value="submit" class="btn btn-primary btn-md" />
									</span>
								</div>
							</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form>
					</div>
				</div>


				<a href='<spring:url value="/register" />' class="btn btn-primary">New
					User Registration</a>
			</div>
		</div>
	</div>
</div>