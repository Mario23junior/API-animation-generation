package com.project.animation.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animation {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String titulo;
	private String TituloOriginal;
	private String descricao;
	
	@ManyToOne
	private Information information;
	
	@ManyToOne
	private SinopsInfo sinopsInfo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTituloOriginal() {
		return TituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		TituloOriginal = tituloOriginal;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Information getInformation() {
		return information;
	}
	public void setInformation(Information information) {
		this.information = information;
	}
	public SinopsInfo getSinopsInfo() {
		return sinopsInfo;
	}
	public void setSinopsInfo(SinopsInfo sinopsInfo) {
		this.sinopsInfo = sinopsInfo;
	}	
	
	
}
