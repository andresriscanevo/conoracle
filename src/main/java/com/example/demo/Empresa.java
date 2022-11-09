package com.example.demo;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name="empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false,unique=false,length=100)
	private String name;
	private String direccion;
	private Date fechadeingreso; 
	@OneToMany(mappedBy="empresa")
	private List<Empleados>empleado;
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFechadeingreso() {
		return fechadeingreso;
	}
	public void setFechadeingreso(Date fechadeingreso) {
		this.fechadeingreso = fechadeingreso;
	}
	
	
}
