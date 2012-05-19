package es.sunion.nominas.dtos;

public class Empleado {
	
	private String provincia;
	private double salarioBruto;
	private String apellidos;
	private String nombre;

	public Empleado(String nombre, String apellidos, String provincia, double salarioBruto) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.provincia = provincia;
		this.salarioBruto = salarioBruto;
	}

	public String getProvincia() {
		return provincia;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

}
