package org.home.cursoJavaFX.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado implements Serializable {

	private static final long serialVersionUID = 358226094974277798L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long codigo;
	@Column
	private String apellidos;
	@Column
	private String nombre;
	
	public Empleado() {
		/*Nothing to do*/
	}

	public Empleado(Long codigo, String apellidos, String nombre) {
		super();
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}
	
	public Empleado(String apellidos, String nombre) {
		super();
		this.apellidos = apellidos;
		this.nombre = nombre;
	}


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [Código:" + codigo + "-Apellidos:" + apellidos + "-Nombre:" + nombre + "]";
	}
	
	
}