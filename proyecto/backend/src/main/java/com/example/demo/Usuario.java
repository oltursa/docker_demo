package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuario")
public class Usuario extends AuditModel {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="usuario_generator")
	@SequenceGenerator(
			name="usuario_generator",
			sequenceName="usuario_sequence",
			initialValue=10
			)
	private Long id;
	
	
	@Column(columnDefinition="nombre",nullable = false,length=100)
	private String nombre;


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
