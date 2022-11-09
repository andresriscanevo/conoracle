package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.NonNull;

@Entity
public class Cliente {
	@Id
	@NonNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@NonNull
	private String documento;
	@NonNull
	private String nombre;
	@NonNull
	private String apellido;
	@NonNull
	private String correo;
	@NonNull
	private String direccion;
	@NonNull
	private String clave;
	@ManyToMany(mappedBy = "listClientes")
	private List<Sucursal> listSucursal;
	@OneToMany(mappedBy = "cliente")
	private List<Cuenta> cuenta;
	
}
