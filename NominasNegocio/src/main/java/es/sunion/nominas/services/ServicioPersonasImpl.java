package es.sunion.nominas.services;

import es.sunion.nominas.apis.HaciendaWS;
import es.sunion.nominas.daos.EmpleadosDao;
import es.sunion.nominas.dtos.Empleado;
import es.sunion.nominas.reglas.ReglasNegocio;


public class ServicioPersonasImpl implements ServicioPersonas {

	private EmpleadosDao empleadosDao;
	private HaciendaWS haciendaWs;
	private ReglasNegocio motorReglas;

	public ServicioPersonasImpl(EmpleadosDao empleadosDao,
			HaciendaWS haciendaWs, ReglasNegocio motorReglas) {
		
		this.empleadosDao = empleadosDao;
		this.haciendaWs = haciendaWs;
		this.motorReglas = motorReglas;
	}

	public double calcularSalarioNeto(String idUsuario) {
		Empleado empleado = empleadosDao.findEmpleadoById(idUsuario);
		
		if(empleado == null)
			throw new UsuarioNoExisteException("El usuario ["+idUsuario+"] no existe");
		
		String provincia = empleado.getProvincia();
		
		double irpfDeducir = haciendaWs.obtenerIrpf(provincia);
		
		double salarioNeto = motorReglas.calcularSalarioNeto(empleado.getSalarioBruto(),irpfDeducir);
		
		return salarioNeto;
	}

}
