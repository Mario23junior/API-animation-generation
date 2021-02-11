package com.project.animation.DTO;

import java.util.List;

public class AnimationDTO {
    
	private Integer id;
	private String titulo;
	private String TituloOriginal;
	private String descricao;
	
	private List<SinopseInfoDTO> sinoInfoDTO;
	private List<InformationDTO> informationDTOs;
	
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
	public List<SinopseInfoDTO> getSinoInfoDTO() {
		return sinoInfoDTO;
	}
	public void setSinoInfoDTO(List<SinopseInfoDTO> sinoInfoDTO) {
		this.sinoInfoDTO = sinoInfoDTO;
	}
	public List<InformationDTO> getInformationDTOs() {
		return informationDTOs;
	}
	public void setInformationDTOs(List<InformationDTO> informationDTOs) {
		this.informationDTOs = informationDTOs;
	}
}
