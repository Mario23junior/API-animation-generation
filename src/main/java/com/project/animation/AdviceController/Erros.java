package com.project.animation.AdviceController;

import java.util.Arrays;
import java.util.List;

public class Erros {
    
	private List<String> erros;
	
	public Erros(String messageGeneration) {
		this.erros = Arrays.asList(messageGeneration);
 	}
	
	public Erros(List<String> erros) {
		this.erros = erros;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}
	
	
}
