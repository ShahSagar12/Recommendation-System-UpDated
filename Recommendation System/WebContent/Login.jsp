
	
									<form class="form" id="formLogin" method="POST" >
										<div class="form-group">
											<label for="uname1">Email</label> <input type="text"
												class="form-control form-control-lg rounded-0" name="emailAddress"
												id="uname1" class="required">
											<div class="invalid-feedback">Oops, you missed this
												one.</div>
										</div>
										<div class="form-group">
											<label>Password</label> <input type="password"
												class="form-control form-control-lg rounded-0" id="pwd1"
												class="required" name="password">
											<div class="invalid-feedback">Enter your password too!</div>
										</div>
										<div>
											<label class="custom-control custom-checkbox"> <input
												type="checkbox" class="custom-control-input"> <span
												class="custom-control-indicator"></span> <span
												class="custom-control-description small text-dark">Remember
													me on this computer</span>
											</label>
										</div>
										<button type="submit"
											class="btn btn-success btn-lg float-right" id="btnLogin" onclick="form.action='loginUser'">Login User</button>
										<button type="submit"
											class="btn btn-success btn-lg float-left" id="btnLogin" onclick="form.action='loginAdmin'">Login Admin</button>
									</form>
								