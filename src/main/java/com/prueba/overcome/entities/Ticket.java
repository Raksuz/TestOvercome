package com.prueba.overcome.entities;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name = "ticket")
public class Ticket implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String titulo;
	
	private String fecha;
	
	@NotEmpty
	private String nombreResponsable;
	
	private String equipoResponsable;
	
	@NotEmpty
	private String incidencia;
	
	@NotEmpty
	private String gravedad;
	
	private String version;
	
	@NotEmpty
	private String descripcion;
}
