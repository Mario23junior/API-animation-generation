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

import com.project.animation.Model.Animation;
import com.project.animation.Repository.AnimationRepository;

@RestController
@RequestMapping("/api/gerence/animation")
public class AnimationController {
   
	private AnimationRepository animationRepository;
	
	public AnimationController(AnimationRepository animationRepository) {
		this.animationRepository = animationRepository;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Animation salvarAnimation(@RequestBody Animation animation) {
		return animationRepository.save(animation);
	}
	
	@GetMapping("/{id}")
	public Animation obterId(@PathVariable Integer id) {
		return animationRepository
			      .findById(id)
			      .orElseThrow( () ->  new ResponseStatusException(HttpStatus.NO_CONTENT,"Desculpe animation não encontrada"));
	}
	
}
  