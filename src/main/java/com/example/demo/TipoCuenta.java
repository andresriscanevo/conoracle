package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.NonNull;

@Entity

public class TipoCuenta {

	@javax.persistence.Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@NonNull
	private String nombre;
	private Double interes;
}
