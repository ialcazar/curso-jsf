package es.sunion.jsf.spring3integracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.sunion.jsf.spring3integracion.daos.MensajesDao;

@Component
public class ExampleService implements Service {
	
	private MensajesDao mensajesDao;
	
	@Autowired
	public ExampleService(MensajesDao mensajesDao) {
		this.mensajesDao = mensajesDao;
	}
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return mensajesDao.getMensaje();	
	}

}
