package es.sunion.nominas.web;

import es.sunion.nominas.services.ServicioPersonas;

public class NominasBacking {
	
	private ServicioPersonas servicioPersonas;
	private String idUsuario;
	private double salario;
	

	public String calcularSalarioNeto() {
		this.salario = servicioPersonas.calcularSalarioNeto(this.idUsuario);
		
		return "pagina1";
	}

	public void setServicioPersonas(ServicioPersonas servicioPersonas) {
		this.servicioPersonas = servicioPersonas;
		
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
