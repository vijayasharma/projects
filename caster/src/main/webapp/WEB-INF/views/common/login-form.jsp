<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container-fluid">
	<div class="card">
		<div class="card-header">Please login here.</div>

		<div class="card-body bg-light">

			<div class="row">
				<div class="col-sm-12 col-md-12">
					<c:if test="${not empty error}">
						<div class="alert alert-danger">${error}</div>
					</c:if>
					<c:if test="${not empty msg}">
						<div class="alert alert-danger">${msg}</div>
					</c:if>
				</div>
			</div>
			<form name='loginForm'
				action="<c:url value='j_spring_security_check' />" method='POST'>

				<div class="row">
					<div class="col-sm-3 col-md-3 col-form-label col-form-label-sm">
						<label for="username">Username</label>
					</div>
					<div class="col-sm-9 col-md-9">
						<input type="text" id="userName"
							class="form-control form-control-sm input-sm chat-input" name="username"
							placeholder="username" />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3 col-md-3 col-form-label col-form-label-sm">
						<label for="username">Password</label>
					</div>
					<div class="col-sm-9 col-md-9"><input type="password"
							name="password" class="form-control form-control-sm input-sm"
							placeholder="password" /></div>
				</div>
				<div class="row">
					<div class="col-sm-12 col-md-9 offset-md-3">

						<div class="wrapper">
							<span class="group-btn"> <input name="submit"
								type="submit" value="submit" class="btn btn-primary btn-sm" />
							</span>
						</div>

						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</div>
				</div>
			</form>
		</div>
		<div class="card-footer text-muted">
    		<a href='<spring:url value="/user/register" />'
						class="btn btn-primary btn-sm">New User Registration</a>
  		</div>
	</div>


</div>
