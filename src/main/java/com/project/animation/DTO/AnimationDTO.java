package com.project.animation.DTO;

public class AnimationDTO {
    
	private Integer id;
	private String titulo;
	private String TituloOriginal;
	private String descricao;
	
	private String DataDeCriacao;
	private String situacao;
	private boolean filme;
	private boolean serie;
	
	private String genero;
	private Integer quantidadeTemporada;
	private Integer quantidadeDeEpisodios;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTituloOriginal() {
		return TituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		TituloOriginal = tituloOriginal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
