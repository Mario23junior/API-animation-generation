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
	public SinopsInfo salvarSinosInfo(@RequestBody SinopsInfo sinopsInfo) {
		return sinopsInfoRepository.save(sinopsInfo);
	}
	
	@GetMapping("/{id}")
	public SinopsInfo obterId(@PathVariable Integer id) {
		return sinopsInfoRepository
				       .findById(id)
				       .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Sinops não encontrada"));
		
	}
	
}
