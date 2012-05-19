package es.spring.service;


public interface LoginService {
	public Boolean loginOk( es.jsf.Login jsfLogin );
	public Boolean loginOk( es.spring.Login springLogin );
}
