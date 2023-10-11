package com.generador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "generador")
public class Codigo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "codigo", nullable = false)
	private String codigo;

	public Codigo() {
		super();
	}

	public Codigo(Long id, String codigo) {
		super();
		this.id = id;
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Codigo [id=" + id + ", codigo=" + codigo + "]";
	}
}
