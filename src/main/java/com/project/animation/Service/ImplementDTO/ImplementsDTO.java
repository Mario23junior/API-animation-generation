package com.project.animation.Service.ImplementDTO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.animation.Model.Animation;
import com.project.animation.Repository.AnimationRepository;
import com.project.animation.Service.ServiceDTOImplemet;

@Service
public class ImplementsDTO implements ServiceDTOImplemet{
   
	private AnimationRepository animationRepository;
	
	public ImplementsDTO( AnimationRepository animationRepository) {
		this.animationRepository = animationRepository;
	}
	
	@Override
	public List<Animation> ListAll() {
		return null;
	}

}
