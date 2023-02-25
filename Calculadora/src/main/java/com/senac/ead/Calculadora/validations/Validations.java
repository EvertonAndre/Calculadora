package com.senac.ead.Calculadora.validations;

import org.springframework.stereotype.Service;

import com.senac.ead.Calculadora.exceptions.UnsupportedMathOperationsExceptions;

@Service
public class Validations {
	
	public Boolean isNumeric(String strNumber) throws Exception {
		if(strNumber == null) {
			throw new UnsupportedMathOperationsExceptions("Não é aceito numeros null");
		}
		
		if(!strNumber.matches("(?:\\.|,|[0-9])*") ){
			throw new UnsupportedMathOperationsExceptions("Só será aceitos numeros inteiros ou reais");
		}else {
		return true;
		}
		
	}
	
	public Double convertToDouble(String strNumber) {
		if(strNumber == null) {
			return 0D;
		}
		String number = strNumber.replaceAll(",", ".");
		
		Double numberOneConvertido =Double.parseDouble(number);
		return numberOneConvertido;
		
	}

}
