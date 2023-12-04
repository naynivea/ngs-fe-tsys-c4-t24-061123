package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IEmpleadoDAO;
import dto.Empleado;
import enums.TipoTrabajo;

@Service
public class EmpleadoService implements IEmpleadoService{
    private static final double NULL = 0;
	@Autowired
    private IEmpleadoDAO empleadoDAO;

    public Empleado guardarEmpleado(Empleado empleado) {
    
        TipoTrabajo tipoTrabajo = empleado.getTipoTrabajo();
        double salario = tipoTrabajo.getSalario();
        if (salario == NULL) {
            empleado.setSalario(tipoTrabajo.getSalario());
        }

        return empleadoDAO.save(empleado);
    }

    public List<Empleado> buscarPorTipoTrabajo(TipoTrabajo tipoTrabajo) {
        return empleadoDAO.findByTipoTrabajo(tipoTrabajo);
    }

    public List<Empleado> obtenerTodosEmpleados() {
        return empleadoDAO.findAll();
    }
    public Empleado obtenerEmpleadoPorId(Long id) {
    	return empleadoDAO.findById(id).get();
    }

    public void eliminarEmpleado(Long id) {
        empleadoDAO.deleteById(id);
    }

    public Empleado actualizarEmpleado(Long id, Empleado empleado) {
       
        return empleadoDAO.save(empleado);
    }
}
