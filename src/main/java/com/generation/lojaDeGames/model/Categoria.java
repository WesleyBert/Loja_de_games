package com.generation.lojaDeGames.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo categoria é Obrigatório")
	@Size(min = 2, max = 100, message = "O atributo título deve conter no mínimo 05 e no maximo 100 caracteres")
	@Column(length = 100)
	private String categoria;
	
	@NotBlank(message = "O atributo descricao da categoria e obrigatorio ")
	@Size(min = 2, max = 100, message = "O atributo descricao da plataforma deve conter no mínimo 05 e no maximo 100 caracteres")
	@Column(length = 100)
	private String plataforma;
	
	@NotBlank(message = "O atributo recursosEspecíficos e obrigatorio ")
	@Size(min = 2, max = 100, message = "O atributo recursosEspecíficos deve conter no mínimo 05 e no maximo 100 caracteres")
	@Column(length = 100)
	private String recursos;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String nomeCategoria) {
		this.categoria = nomeCategoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public String getRecursos() {
		return recursos;
	}

	public void setRecursos(String recursosEspecificos) {
		this.recursos = recursosEspecificos;
	}

}
