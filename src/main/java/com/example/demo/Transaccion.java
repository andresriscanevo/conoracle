package com.example.demo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "transaccion")
public class Transaccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false,unique=false,length=100)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	private char TipoDeTransaccion;
	private int valor;
	private int saldo_actual;
	@ManyToOne
	@JoinColumn(name="idCuenta")
	private Cuenta cuenta;
	
}
