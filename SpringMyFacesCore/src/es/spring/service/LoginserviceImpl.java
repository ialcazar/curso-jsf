package es.spring.service;

import org.springframework.stereotype.Component;

import es.jsf.Login;

@Component
public class LoginserviceImpl implements LoginService {

	public Boolean loginOk(Login jsfLogin) {
		return this.login( jsfLogin.getUsername() );
	}

	public Boolean loginOk(es.spring.Login springLogin) {
		return this.login( springLogin.getUsername() );
	}
	
	protected Boolean login( String username ) {
		System.out.println( "Login para el usuario "+username );
		if ( username .equalsIgnoreCase("jha") )
			return new Boolean( true );
		return new Boolean( false );
	}

}
