package com.github.rodrigueslg.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.rodrigueslg.converters.NumberConverter;
import com.github.rodrigueslg.exceptions.UnsupportedMathOperationException;

public final class SimpleMath {

	public SimpleMath() {
	}
	
	public Double sum(Double n1, Double n2) {
		return n1 + n2;
	}
	
	public Double sub(Double n1, Double n2) {
		return n1 - n2;
	}
	
	public Double div(Double n1, Double n2) {
		return n1 / n2;
	}
	
	public Double mult(Double n1,Double n2) {
		return n1 * n2;
	}
	
	public Double square(Double n) {
		return Math.sqrt(n);
	}
}
