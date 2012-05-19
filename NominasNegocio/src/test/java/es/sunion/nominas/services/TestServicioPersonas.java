package es.sunion.nominas.services;

import static org.junit.Assert.*;

import org.junit.Test;

import es.sunion.nominas.apis.HaciendaWS;
import es.sunion.nominas.daos.EmpleadosDao;
import es.sunion.nominas.dtos.Empleado;
import es.sunion.nominas.reglas.ReglasNegocio;
import static org.mockito.Mockito.*;


//SUT: ServicioPersonas
public class TestServicioPersonas {

	
	private static final String ID_EMPLEADO = "1234";

	@Test public void 
	debe_calcular_salario_neto_de_empleado_resultado_esperado() {
		Empleado empleado = new Empleado("Israel","Alc‡zar","MAD",3000.0);
		
		EmpleadosDao  empleadosDao = mock(EmpleadosDao.class);
		HaciendaWS    haciendaWs   = mock(HaciendaWS.class);
		ReglasNegocio motorReglas  = mock(ReglasNegocio.class);
		
		when(empleadosDao.findEmpleadoById(ID_EMPLEADO)).thenReturn(empleado);
		when(haciendaWs.obtenerIrpf("MAD")).thenReturn(500d);
		
		
		ServicioPersonas servicioPersonas = new ServicioPersonasImpl(empleadosDao,haciendaWs,motorReglas);
		
		
		servicioPersonas.calcularSalarioNeto(ID_EMPLEADO);
		
//		assertEquals(2500,salarioNeto,0);
		
		verify(empleadosDao).findEmpleadoById(ID_EMPLEADO);
		verify(haciendaWs).obtenerIrpf("MAD");
		verify(motorReglas).calcularSalarioNeto(3000.0,500d);
		
		
		
		
	}
	
	@Test public void 
	debe_calcular_salario_neto_de_empleado_el_empleado_no_existe() {
		Empleado empleado = new Empleado("Israel","Alc‡zar","MAD",3000.0);
		
		EmpleadosDao  empleadosDao = mock(EmpleadosDao.class);
		HaciendaWS    haciendaWs   = mock(HaciendaWS.class);
		ReglasNegocio motorReglas  = mock(ReglasNegocio.class);
		
		when(empleadosDao.findEmpleadoById(ID_EMPLEADO)).thenReturn(null);
		
		
		
		ServicioPersonas servicioPersonas = new ServicioPersonasImpl(empleadosDao,haciendaWs,motorReglas);
		
		try{
			servicioPersonas.calcularSalarioNeto(ID_EMPLEADO);
			fail("No se ha producido la excepci—n");
		}catch(UsuarioNoExisteException e){}
		
//		assertEquals(2500,salarioNeto,0);
		
		verify(empleadosDao).findEmpleadoById(ID_EMPLEADO);
	
		
		
		
	}

}
