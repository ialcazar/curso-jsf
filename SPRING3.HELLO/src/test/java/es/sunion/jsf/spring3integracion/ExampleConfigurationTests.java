package es.sunion.jsf.spring3integracion;

import static org.junit.Assert.assertNotNull;

import es.sunion.jsf.spring3integracion.Service;
import es.sunion.jsf.spring3integracion.daos.MensajesDao;
import es.sunion.jsf.spring3integracion.daos.MensajesDaoImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfigurationTests {
	
	@Autowired
	private Service service;

	@Test
	public void testSimpleProperties() throws Exception {
		
		
		assertNotNull(service.getMessage());
		
	}
	
}
