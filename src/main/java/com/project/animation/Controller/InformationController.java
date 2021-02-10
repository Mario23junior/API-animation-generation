package com.project.animation.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.project.animation.Model.Information;
import com.project.animation.Repository.InformationRepository;

@RestController
@RequestMapping("/api/gerence/information")
public class InformationController {
    
	private InformationRepository informationRepository;
	
	public InformationController(InformationRepository informationRepository) {
		 this.informationRepository = informationRepository;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Information salvarDados(@RequestBody Information information) {
		return informationRepository.save(information);
	}
	
	@GetMapping("/{id}")
	public Information listarPorId(@PathVariable Integer id) {
		return informationRepository
				           .findById(id)
				           .orElseThrow( () -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Dados não encontrados"));
	}
 	
	
	
	
}
