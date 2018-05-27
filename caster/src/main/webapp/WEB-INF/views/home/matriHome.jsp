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
			<div class="card">
				<div class="card-header">Please login here.</div>

				<div class="card-body bg-light">

					<form class="form-horizontal">
						<div class="form-group">
							<label class="control-label col-sm-2" for="email">Email:</label>
							<div class="col-sm-10">
								<input type="email" class="form-control" id="email"
									placeholder="Enter email">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2" for="pwd">Password:</label>
							<div class="col-sm-10">
								<input type="password" class="form-control" id="pwd"
									placeholder="Enter password">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label><input type="checkbox"> Remember me</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-success">Submit</button>
								<button type="submit" class="btn btn-primary">Register</button>
							</div>
						</div>
					</form>
					<a href='<spring:url value="/user/register" />'
						class="btn btn-primary">New User Registration</a>
				</div>
			</div>
		</div>
	</div>
	
</div>