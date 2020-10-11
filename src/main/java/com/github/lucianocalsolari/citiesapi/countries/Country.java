package com.github.lucianocalsolari.citiesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="pais")
public class Country {
	
	@Id
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="nome_pt")
	private  String portugueseName;
	
	@Column(name = "sigla")
	private String code;
	
	private Integer bacen;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPortugueseName() {
		return portugueseName;
	}

	public void setPortugueseName(String portugueseName) {
		this.portugueseName = portugueseName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getBacen() {
		return bacen;
	}

	public void setBacen(Integer bacen) {
		this.bacen = bacen;
	}
	
}
