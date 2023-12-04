package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dto.Empleado;
import enums.TipoTrabajo;

@Repository
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {
    // Método especializado para buscar empleados por trabajo
    List<Empleado> findByTipoTrabajo(TipoTrabajo tipoTrabajo);
}


