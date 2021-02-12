package com.project.animation.DTOController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.animation.DTO.AnimationDTO;
import com.project.animation.Service.ServiceDTOImplemet;

@RestController
public class ControllerDTO {
    
	private ServiceDTOImplemet mapService;
	
	public ControllerDTO( ServiceDTOImplemet mapService) {
		this.mapService = mapService;
	}
	
	@GetMapping("/listAll")
	public List<AnimationDTO> ListAllData() {
		List<AnimationDTO> animationDAO = mapService.ListAll();
		return animationDAO;
	}
}
