package com.project.animation.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Information {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String genero;
	private Integer quantidadeTemporada;
	private Integer quantidadeDeEpisodios;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getQuantidadeTemporada() {
		return quantidadeTemporada;
	}
	public void setQuantidadeTemporada(Integer quantidadeTemporada) {
		this.quantidadeTemporada = quantidadeTemporada;
	}
	public Integer getQuantidadeDeEpisodios() {
		return quantidadeDeEpisodios;
	}
	public void setQuantidadeDeEpisodios(Integer quantidadeDeEpisodios) {
		this.quantidadeDeEpisodios = quantidadeDeEpisodios;
	}
	
	
	
	
}
