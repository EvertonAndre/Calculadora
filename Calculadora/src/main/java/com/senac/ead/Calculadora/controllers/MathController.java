package com.senac.ead.Calculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senac.ead.Calculadora.exceptions.UnsupportedMathOperationsExceptions;
import com.senac.ead.Calculadora.validations.Validations;

@RestController
public class MathController {

	@Autowired
	Validations validation;

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {

		}
		return validation.convertToDouble(numberOne) + validation.convertToDouble(numberTwo);

	}

	@RequestMapping(value ="/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {

		}
		return validation.convertToDouble(numberOne) - validation.convertToDouble(numberTwo);

	}
	
	@RequestMapping(value ="/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {

		}
		
		return validation.convertToDouble(numberOne) * validation.convertToDouble(numberTwo);

	}
	
	@RequestMapping(value ="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double divison(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {

		}
		
		
		if(validation.convertToDouble(numberTwo) == 0) {
			throw new UnsupportedMathOperationsExceptions("Não é possivel dividir por zero");
		}
		
		return validation.convertToDouble(numberOne) / validation.convertToDouble(numberTwo);

	}
	
}
