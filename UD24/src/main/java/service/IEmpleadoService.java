package service;

import java.util.List;

import dto.Empleado;

public interface IEmpleadoService {
	public List<Empleado> obtenerTodosEmpleados();
	public Empleado guardarEmpleado(Empleado empleado);
	public Empleado actualizarEmpleado(Long id, Empleado empleado);
	public Empleado obtenerEmpleadoPorId (Long id);
	public void eliminarEmpleado (Long id);
}
