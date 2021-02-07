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
	private String dataDescricao;
	private String genero;
	private String quantidadeTemporada;
	private String quantidadeDeEpisodios;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDataDescricao() {
		return dataDescricao;
	}
	public void setDataDescricao(String dataDescricao) {
		this.dataDescricao = dataDescricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getQuantidadeTemporada() {
		return quantidadeTemporada;
	}
	public void setQuantidadeTemporada(String quantidadeTemporada) {
		this.quantidadeTemporada = quantidadeTemporada;
	}
	public String getQuantidadeDeEpisodios() {
		return quantidadeDeEpisodios;
	}
	public void setQuantidadeDeEpisodios(String quantidadeDeEpisodios) {
		this.quantidadeDeEpisodios = quantidadeDeEpisodios;
	}
	
	
	
	
}
