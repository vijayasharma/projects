<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">

	<div class="row" style="padding-top: 20px;">
		<div class="col-sm-12">
			<div class="panel panel-default">
				<div class="panel-heading text-danger">Something went wrong!!!</div>
				<div class="panel-body">
					
					${status}
					<br/>
					${reason}
				
				</div>
			</div>
		</div>
	</div>



</div>