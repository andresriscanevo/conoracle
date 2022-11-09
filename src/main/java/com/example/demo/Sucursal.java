package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Sucursal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false,unique=false,length=100)
	private String nombreSucursal;
	private String direccion;
	@JoinTable(name = "rel_sucursal_cliente",
	        joinColumns = @JoinColumn(name = "FK_SUCURSAL", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="FK_CLIENTE", nullable = false))
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Cliente> listClientes;
	
}
