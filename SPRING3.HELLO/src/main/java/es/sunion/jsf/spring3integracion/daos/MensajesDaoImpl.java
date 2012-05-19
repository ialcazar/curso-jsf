package es.sunion.jsf.spring3integracion.daos;

import org.springframework.stereotype.Component;

@Component
public class MensajesDaoImpl implements MensajesDao {

	public String getMensaje() {
		
		return "Hola Mundo";
	}

}
