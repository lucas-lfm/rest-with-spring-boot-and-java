package br.com.proflucas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.proflucas.exceptions.UnsupportedMathOperationException;
import br.com.proflucas.utils.NumberConverter;

@Service
public class MathService {
	
	@Autowired
	private NumberConverter numberConverter;

	public Double sum(String numberOne, String numberTwo) throws Exception {
		if(!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return numberConverter.convertToDouble(numberOne) + numberConverter.convertToDouble(numberTwo);
	}
	
	public Double sub(String numberOne, String numberTwo) throws Exception {
		
		if(!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return numberConverter.convertToDouble(numberOne) - numberConverter.convertToDouble(numberTwo);
	}
	
	public Double mul(String numberOne, String numberTwo) throws Exception {
		
		if(!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return numberConverter.convertToDouble(numberOne) * numberConverter.convertToDouble(numberTwo);
	}
	
	public Double div(String numberOne, String numberTwo) throws Exception {
		
		if(!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		if(numberConverter.convertToDouble(numberTwo) == 0D) {
			throw new UnsupportedMathOperationException("It isn't possible to divide by 0!");
		}
		
		return numberConverter.convertToDouble(numberOne) / numberConverter.convertToDouble(numberTwo);
	}
	
	public Double mean(String numberOne, String numberTwo) throws Exception {
		
		if(!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return (numberConverter.convertToDouble(numberOne) + numberConverter.convertToDouble(numberTwo)) / 2;
	}
	
	public Double sqrt(String number) throws Exception {
		
		if(!numberConverter.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		if(numberConverter.convertToDouble(number) < 0) {
			throw new UnsupportedMathOperationException("There's no square root of negative numbers!");
		}
		
		return Math.sqrt(numberConverter.convertToDouble(number));
	}
	
}
