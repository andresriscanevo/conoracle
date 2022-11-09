package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor

public class Empleados {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer documento;
	private String nombre;
	private String apellido;
	private Integer sueldo;
	private Integer cantidadHijos;
	private Date fechadeingreso;
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	public Integer getDocumento() {
		return documento;
	}
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getSueldo() {
		return sueldo;
	}
	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public Date getFechadeingreso() {
		return fechadeingreso;
	}
	public void setFechadeingreso(Date fechadeingreso) {
		this.fechadeingreso = fechadeingreso;
	}
}
