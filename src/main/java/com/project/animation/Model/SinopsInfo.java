package com.project.animation.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class SinopsInfo {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	 
	 @JsonFormat(pattern = "dd/MM/yyyy",shape = Shape.STRING)
	 @Column(name = "data_de_criacao")
  	 private String DataDeCriacao;
	 
	 private String situacao;
	 private boolean filme;
	 private boolean serie;
	 
	 @OneToMany(mappedBy = "sinopsInfo",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 private List<Animation> animations;
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDataDeCriacao() {
		return DataDeCriacao;
	}
	public void setDataDeCriacao(String dataDeCriacao) {
		DataDeCriacao = dataDeCriacao;
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
