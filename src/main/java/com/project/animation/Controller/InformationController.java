package com.project.animation.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Information salvarDados(@RequestBody @Valid Information information) {
		return informationRepository.save(information);
	}
	
	@GetMapping("/{id}")
	public Information listarPorId(@PathVariable Integer id) {
		return informationRepository
				           .findById(id)
				           .orElseThrow( () -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Dados não encontrados"));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		informationRepository
		                .findById(id)
		                .map(deleteInformation -> {
		                     informationRepository.deleteById(id);
		                     return deleteInformation;
		                }).orElseThrow( () -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Information não encontrado"));
		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateInformation(@RequestBody @Valid Information information, @PathVariable Integer id) {
		  informationRepository
		                 .findById(id)
		                 .map(updateInfo -> {
		                	  information.setId(updateInfo.getId());
		                	  informationRepository.save(information);
		                	  return updateInfo;
		                 }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"informação não encontrda"));
	}
	
	
	@GetMapping
	public List<Information> listarTodoOsRegistro(Information information) {
		return informationRepository.findAll();
				             
	}
}
