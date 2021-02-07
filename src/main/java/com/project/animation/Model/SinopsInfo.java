package com.project.animation.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SinopsInfo {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	 private String DataDescricao;
	 private String situacao;
	 private boolean filme;
	 private boolean serie;
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDataDescricao() {
		return DataDescricao;
	}
	public void setDataDescricao(String dataDescricao) {
		DataDescricao = dataDescricao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public boolean isFilme() {
		return filme;
	}
	public void setFilme(boolean filme) {
		this.filme = filme;
	}
	public boolean isSerie() {
		return serie;
	}
	public void setSerie(boolean serie) {
		this.serie = serie;
	}
	 
	 
	 
	 
}
