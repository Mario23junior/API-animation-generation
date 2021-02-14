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

import com.project.animation.Model.SinopsInfo;
import com.project.animation.Repository.SinopsInfoRepository;

@RestController
@RequestMapping("/api/gerence/sinops")
public class SinopsInfoController {
    
	private SinopsInfoRepository sinopsInfoRepository;
	
	public SinopsInfoController(SinopsInfoRepository sinopsInfoRepository) {
		 this.sinopsInfoRepository = sinopsInfoRepository;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SinopsInfo salvarSinosInfo(@RequestBody @Valid SinopsInfo sinopsInfo) {
		return sinopsInfoRepository.save(sinopsInfo);
	}
	
	@GetMapping("/{id}")
	public SinopsInfo obterId(@PathVariable Integer id) {
		return sinopsInfoRepository
				       .findById(id)
				       .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Sinops não encontrada"));
		
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteSinop(@PathVariable Integer id) {
	     sinopsInfoRepository
	                   .findById(id)
	                   .map(deleteSinopse -> {
	                	   sinopsInfoRepository.delete(deleteSinopse);
	                	   return deleteSinopse;
	                   }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Sinopse não encontrado"));
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void UpdateSinops(@PathVariable Integer id,@Valid @RequestBody SinopsInfo sinoInfo) {
		    sinopsInfoRepository
		                    .findById(id)
		                    .map(update -> {
		                    	sinoInfo.setId(update.getId());
		                    	sinopsInfoRepository.save(sinoInfo);
		                    	return update;
		                    }).orElseThrow( () -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Sinops não encontrada"));
	}
	
	@GetMapping
	public List<SinopsInfo> buscarTodos(SinopsInfo sinopsInfo) {
		return sinopsInfoRepository.findAll();
 	}
}
