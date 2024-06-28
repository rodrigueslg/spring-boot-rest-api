package com.github.rodrigueslg.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.rodrigueslg.converters.NumberConverter;
import com.github.rodrigueslg.exceptions.UnsupportedMathOperationException;
import com.github.rodrigueslg.math.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath simpleMath = new SimpleMath();
	
	@RequestMapping(value = "/sum/{n1}/{n2}", method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2) throws Exception {
		
		if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Plase set a numeric value");
		}
		return simpleMath.sum(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
	}
	
	@RequestMapping(value = "/sub/{n1}/{n2}", method=RequestMethod.GET)
	public Double sub(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2) throws Exception {
		
		if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Plase set a numeric value");
		}
		return simpleMath.sub(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
	}
	
	@RequestMapping(value = "/div/{n1}/{n2}", method=RequestMethod.GET)
	public Double div(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2) throws Exception {
		
		if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Plase set a numeric value");
		}
		return simpleMath.div(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
	}
	
	@RequestMapping(value = "/mult/{n1}/{n2}", method=RequestMethod.GET)
	public Double mult(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2) throws Exception {
		
		if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Plase set a numeric value");
		}
		return simpleMath.mult(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
	}
	
	@RequestMapping(value = "/square/{n}", method=RequestMethod.GET)
	public Double square(
			@PathVariable(value = "n") String n) throws Exception {
		
		if (!NumberConverter.isNumeric(n)) {
			throw new UnsupportedMathOperationException("Plase set a numeric value");
		}
		return simpleMath.square(NumberConverter.convertToDouble(n));
	}
}
