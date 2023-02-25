package com.senac.ead.Calculadora.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationsExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UnsupportedMathOperationsExceptions(String ex) {
		super(ex);
	}


}
