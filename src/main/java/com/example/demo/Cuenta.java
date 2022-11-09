package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;


@Entity
public class Cuenta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String numero;
	
	private String Tipo_cuenta;
	@OneToMany(mappedBy = "cuenta")
	
	private List<Transaccion> transacciones;
	@ManyToOne
	@JoinColumn(name="idClientes")
	private Cliente cliente;
}
