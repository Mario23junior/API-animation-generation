package com.project.animation.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.animation.Model.Animation;
import com.project.animation.Repository.AnimationRepository;

@RestController
@RequestMapping("/api/gerence/animation")
public class AnimationController {
   
	private AnimationRepository informationRepository;
	
	public AnimationController(AnimationRepository informationRepository) {
		this.informationRepository = informationRepository;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Animation salvarAnimation(@RequestBody Animation animation) {
		return informationRepository.save(animation);
	}
	
}
  