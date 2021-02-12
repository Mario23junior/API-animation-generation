package com.project.animation.Service.ImplementDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.animation.DTO.AnimationDTO;
import com.project.animation.Model.Animation;
import com.project.animation.Model.Information;
import com.project.animation.Model.SinopsInfo;
import com.project.animation.Repository.AnimationRepository;
import com.project.animation.Service.ServiceDTOImplemet;

@Service
public class ImplementsDTO implements ServiceDTOImplemet{
   
	private AnimationRepository animationRepository;
	
	public ImplementsDTO(AnimationRepository animationRepository) {
		this.animationRepository = animationRepository;
	}
	
	@Override
	public List<AnimationDTO> ListAll() {
		 return ((List<Animation>) animationRepository
				          .findAll())
				          .stream()
				          .map(this::converterToAnimationDTO)
				          .collect(Collectors.toList());
 	}
	
	private AnimationDTO converterToAnimationDTO(Animation animation) {
	     AnimationDTO animaDTO = new AnimationDTO();
	     animaDTO.setId(animation.getId());
	     animaDTO.setTitulo(animation.getTitulo());
	     animaDTO.setTituloOriginal(animation.getTituloOriginal());
	     animaDTO.setDescricao(animation.getDescricao());
	     
	     SinopsInfo sinopInfo = animation.getSinopsInfo();
	     animaDTO.setDataDeCriacao(sinopInfo.getDataDeCriacao());
	     animaDTO.setSituacao(sinopInfo.getDataDeCriacao());
	     animaDTO.setFilme(sinopInfo.isFilme());
	     animaDTO.setSerie(sinopInfo.isSerie());
	     
	     Information infor = animation.getInformation();
	     animaDTO.setGenero(infor.getGenero());
	     animaDTO.setQuantidadeTemporada(infor.getQuantidadeTemporada());
	     animaDTO.setQuantidadeDeEpisodios(infor.getQuantidadeDeEpisodios());
	    
	     return animaDTO;
	}

}
