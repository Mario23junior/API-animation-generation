package com.project.animation.Controller;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletaAnimation(@PathVariable Integer id) {
		    animationRepository
				          .findById(id)
		                  .map(delete -> {
		                	 animationRepository.delete(delete);
		                	 return delete;
		                  }).orElseThrow( () -> new ResponseStatusException(HttpStatus.NO_CONTENT,"ID não encontrado para deletação"));
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateAnimation(@PathVariable Integer id,@RequestBody Animation animation) {
	    animationRepository
	                    .findById(id)
	                    .map(updateAnima -> {
	                        animation.setId(updateAnima.getId());
	                        animationRepository.save(animation);
	                        return updateAnima;
	                    }).orElseThrow( () -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Cliente não encontrado"));
	}
	
	@GetMapping
	public List<Animation> buscarTodos(Animation findAnimation) {
		ExampleMatcher compara = ExampleMatcher
				                      .matching()
				                      .withIgnoreCase()
				                      .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
		Example<Animation> example = Example.of(findAnimation, compara);
		return animationRepository.findAll(example);
	}	
}