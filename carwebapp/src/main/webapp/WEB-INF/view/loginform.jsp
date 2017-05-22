<%@include file="header.jsp"%>

<div class="content">

	<div class="row">

		<div class="col-sm-4"></div>
		<div class="col-sm-4">

			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-12">
						<h1>Log In</h1>

					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<form class="form"  method="post">

							${error}

							<div class="form-group">
								<label>Email</label> <input type="text" name="email"
									class="form-control" required>

							</div>
							<div class="form-group">
								<label>Password</label> <input type="password" name="password"
									class="form-control" required>
							</div>
							<center>
							<input type="submit" value="Log In" class="btn btn-primary">
						<div class="btn-group btn-group-lg">
							<a href="reg"><button type="button" class="btn btn-info" >SignUP</button></a>

						</div>
					</center>
							
						</form>
						

					</div>
				</div>

			</div>



		</div>
		<div class="col-sm-4"></div>

	</div>

</div>
</div>
