package com.github.lucianocalsolari.citiesapi.states;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.github.lucianocalsolari.citiesapi.countries.Country;

@Entity(name = "State")
@Table(name = "estado")
public class State {
	
	@Id
	private Long id;
	
	@Column(name ="nome")
	private String name;
	
	private String uf;
	
	private Integer ibge;
	
	@ManyToOne
	@JoinColumn(name = "pais", referencedColumnName = "id")
	private Country country;
	
	@Type(type = "jsonb")
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "ddd", columnDefinition = "jsonb" )
	private List<Integer> ddd;
	
	public State() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUf() {
		return uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public Country getCountry() {
		return country;
	}

	public List<Integer> getDdd() {
		return ddd;
	}
	
	
	
}
