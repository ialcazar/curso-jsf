package es.sunion.nominas.daos;

import es.sunion.nominas.dtos.Empleado;

public interface EmpleadosDao {

	Empleado findEmpleadoById(String idUsuario);

}
