package es.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.spring.service.LoginService;

@Component(value="springLogin")
public class Login {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
	private LoginService loginService;
	
	public LoginService getLoginService() {
		return loginService;
	}
	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String action() {
		Boolean loginOk = this.loginService.loginOk( this );
		if ( loginOk.booleanValue() )
			return "success";
		return "error";
	}
	
}
