package es.sunion.nominas.web;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import es.sunion.nominas.services.ServicioPersonas;

//SUT: NominasBacking
public class TestNominasBacking {
	private NominasBacking nominasBacking;
	private ServicioPersonas servicioPersonas;
	
	@Before
	public void inicializarObjetos(){
		nominasBacking = new NominasBacking();
	}

	@Test public void 
	debe_calcular_salario_neto_de_empleado_resultado_esperado() {
		//Creación de objetos: Inicialización: Arrange
		creacionMocks();
			
		nominasBacking.setServicioPersonas(servicioPersonas);
		
		
		//LLamar a los métodos que quiero probar: Act
		String navegacion = nominasBacking.calcularSalarioNeto();
		
		
		
		//Comprobaciones: Asserts
		
		assertEquals("pagina1", navegacion);
		verify(servicioPersonas).calcularSalarioNeto(anyString());

		
	
	}

	private void creacionMocks() {
		this.servicioPersonas = mock(ServicioPersonas.class);
		
	}

}
