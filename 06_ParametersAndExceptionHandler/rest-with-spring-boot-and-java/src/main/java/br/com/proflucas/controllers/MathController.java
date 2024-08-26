package br.com.proflucas.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.proflucas.services.MathService;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private MathService mathService;
	
	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne, 
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		return mathService.sum(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/sub/{numberOne}/{numberTwo}")
	public Double sub(
			@PathVariable(value = "numberOne") String numberOne, 
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		return mathService.sub(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/mul/{numberOne}/{numberTwo}")
	public Double mul(
			@PathVariable(value = "numberOne") String numberOne, 
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		return mathService.mul(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/div/{numberOne}/{numberTwo}")
	public Double div(
			@PathVariable(value = "numberOne") String numberOne, 
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		return mathService.div(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/mean/{numberOne}/{numberTwo}")
	public Double mean(
			@PathVariable(value = "numberOne") String numberOne, 
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		return mathService.mean(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/sqrt/{number}")
	public Double sqrt(
			@PathVariable(value = "number") String number) throws Exception {
		
		return mathService.sqrt(number);
	}
	
}