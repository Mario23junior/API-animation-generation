package com.project.animation.AdviceController;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAdvice {
   
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Erros handleMethodNotValidException(MethodArgumentNotValidException ex) {
		List<String> ResultDefautErros = ex.getBindingResult().getAllErrors()
		                            .stream()
		                            .map(erro -> erro.getDefaultMessage())
		                            .collect(Collectors.toList());
		return new Erros (ResultDefautErros);
	}
}
