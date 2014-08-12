<!-- This JSP page displays the login form -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!-- 
<div id="form">
	<p>Please enter your login credentials</p>
	<form>
		<div class="message" style="display: none;">&nbsp;</div>
		<div class="error" style="display: none;">&nbsp;</div>
		<div>
			<label for="j_username">User:</label> 
			<input type='text' id="j_username" name='j_username' />
		</div>
		<div style="clear: both;"></div>
		<div>
			<label for="j_password">Password:</label> 
			<input type="password" id="j_password" name="j_password" />
		</div>
		<div style="clear: both;"></div>
		<div id="rememberMe">
			<input type="checkbox" name="_spring_security_remember_me" id="_spring_security_remember_me" /> 
			<label for="_spring_security_remember_me">Don't ask for my password for two weeks</label>
		</div>
		<div style="clear: both;"></div>
		<button type="button">Login</button>
	</form>
</div>  -->

<head>
	<script type="text/javascript">	
		
		$(function() {
			// Calling Login Form
			$("#login_form").click(function() {
				
				$(".social_login").hide();
				$(".user_login").show();
				return false;
			});
		});
	</script>
</head>

<div id="form">
	<section class="popupBody">		
		<div class="social_login">
			<div class="">
				<a href="#" class="social_box fb"> 
					<span class="icon"> <i class="fa fa-facebook"></i>
					</span> 
					<span class="icon_title">Connect with Facebook</span>

				</a> 
				<a href="#" class="social_box google"> 
					<span class="icon">
						<i	class="fa fa-google-plus"></i>
					</span> 
					<span class="icon_title">Connect with Google</span>
				</a>
			</div>

			<div class="centeredText">
				<span class="popuptext">Or use your Email address</span>
			</div>

			<div class="action_btns">
				<div class="one_half">
					<a href="#" id="login_form" class="btn">Login</a>
				</div>
				<div class="one_half last">
					<a href="#" id="register_form" class="btn">Sign up</a>
				</div>
			</div>
		</div>

		
		<div class="user_login">
			<form>
				<div class="message" style="display: none;">&nbsp;</div>
				<div class="error" style="display: none;">&nbsp;</div>
				<div>
					<label for="j_username" class="popuptext">User:</label> 
					<input type='text' id="j_username" name='j_username' />
				</div>
				<div style="clear: both;"></div>
				<div>
					<label for="j_password" class="popuptext">Password:</label> 
					<input type="password" id="j_password" name="j_password" />
				</div>
				<div style="clear: both;"></div>
				<div id="rememberMe">
					<input type="checkbox" name="_spring_security_remember_me" id="_spring_security_remember_me" /> 
					<label for="_spring_security_remember_me">Don't ask for my password for two weeks</label>
				</div>
				
				<div class="action_btns">
						<div class="one_half">
							<a href="#" class="btn back_btn">
								<i class="fa fa-angle-double-left"></i> Back
							</a>
						</div>
						<div class="one_half last"><a href="#" class="btn btn_red" id="loginform">Login</a></div>
					</div>
				<!-- <button type="button">Login</button> -->
			</form>

			<a href="#" class="forgot_password">Forgot password?</a>
		</div>

	
		<div class="user_register">
			<form>
				<label>Full Name</label> 
				<input type="text" /> <br /> 
				<label>Email Address</label> 
				<input type="email" /> <br /> 
				<label>Password</label> 
				<input type="password" /> <br />

				<div class="checkbox">
					<input id="send_updates" type="checkbox" /> 
					<label for="send_updates">Send me occasional email updates</label>
				</div>

				<div class="action_btns">
					<div class="one_half">
						<a href="#" class="btn back_btn">
							<i class="fa fa-angle-double-left"></i> Back
						</a>
					</div>
					<div class="one_half last">
						<a href="#" class="btn btn_red">Register</a>
					</div>
				</div>
			</form>
		</div>
	</section>
</div>



