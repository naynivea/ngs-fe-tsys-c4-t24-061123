package dto;

import enums.TipoTrabajo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="empleado")
public class Empleado {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column
    private String nombre;
	private String apellido;
	private String direccion;
    private TipoTrabajo trabajo;
    private double salario;
	
	public Empleado() {
	}

	public Empleado(Long id, String nombre, String apellido, String direccion, TipoTrabajo trabajo, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.trabajo = trabajo;
		this.setSalario(salario);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public TipoTrabajo getTipoTrabajo() {
		return trabajo;
	}


	public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
		this.trabajo = tipoTrabajo;
	}

	public TipoTrabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(TipoTrabajo trabajo) {
		this.trabajo = trabajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}