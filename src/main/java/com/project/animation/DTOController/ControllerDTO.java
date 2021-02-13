package com.project.animation.DTOController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	@ResponseStatus(HttpStatus.CREATED)
	public List<AnimationDTO> ListAllData() {
		List<AnimationDTO> animationDAO = mapService.ListAll();
		return animationDAO;
	}
}
