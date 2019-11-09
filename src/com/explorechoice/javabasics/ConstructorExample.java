/**
 * @author gaurnitai
 * @created_date 09-Nov-2019
 */


package com.explorechoice.javabasics;

public class ConstructorExample {

	int x;
	private double y;
	static double d;
	
	public ConstructorExample(int a, double b, double c){
		x = a;
		y = b;
		d = c;
		
	}
	
	{
		d = 45;
	}

	
	ConstructorExample(){
		x = 20;
		y = 30;
	
		
	}
//	
//	ConstructorExample(int a){
//		x = a;		
//	}
	
	
	
	
	public void add() {
	
		double r = x + y;
		System.out.println(r);
	}
	
	public void sub() {
		
		double r = x - y;
		System.out.println(r);
	}
	
	
	public void setY(double a) {
		y = a;
	}
	
	public double getY() {
		return y;
	}
	

	

}


