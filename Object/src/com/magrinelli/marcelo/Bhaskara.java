package com.magrinelli.marcelo;

public class Bhaskara {
	private final double a;
	private final double b;
	private final double c;
	
	public Bhaskara(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;		
	}
	
	public double delta(double a, double b, double c){
		  double delta = Math.pow(b, 2) - 4 * (a * c);
		  return delta;
	}
	
	public double[] retornaRaizes(){
		double [] raizes = new double[2];
		double delta = delta(this.a, this.b, this. c);
		if(delta < 0){
			raizes[0] = delta;
			return raizes;
		} else {
			raizes[0] = (-this.b + Math.sqrt(delta)) / (2 * this.a);
			raizes[1] = (-this.b - Math.sqrt(delta)) / (2 * this.a);			 
			return raizes;	
		}	
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
}