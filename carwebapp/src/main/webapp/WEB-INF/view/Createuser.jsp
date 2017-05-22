<%@ include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="content">
	<div class="container-fluid">

		<div class="row">
			<div class="col-sm-4"></div>
			<div class="cols-sm-4">
				<center><h2 style="color: #D35A40;">SIGN UP</h2></center>
				<br>
				<form:form method="post" modelAttribute="UserDetails" action="register">
					<div class="form-group">
						<label for="myname">User Name</label>
						<form:input path="myname" class="form-control" />
						<form:errors path="myname"></form:errors>
					</div>
					<div class="form-group">
						<label for="email">Email</label>
						<form:input path="email" class="form-control" />
						<form:errors path="email"></form:errors>
					</div>
					<div class="form-group">
						<label for="contactno">Mobile</label>
						<form:input path="contactno" class="form-control" />
						<form:errors path="contactno"></form:errors>
					</div>
					<div class="form-group">
						<label for="password">Password</label>
						<form:password path="password" class="form-control" />
						<form:errors path="password"></form:errors>
					</div>
					<div class="form-group">
					
					<form:hidden path="role" value="CUSTOMER" hidden="true"
					class="form-control"/>
					</div>
					
					<center>
						<input type="submit" name="_eventId_submit"
							class="btn btn-primary" value="SUBMIT">&nbsp;&nbsp;
							 <input type="submit" name="_eventId_cancel" value="CANCEL"
							class="btn btn-danger" />
					</center>
				</form:form>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
</div>