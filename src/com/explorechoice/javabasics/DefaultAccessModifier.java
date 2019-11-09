/**
 * @author gaurnitai
 * @created_date 09-Nov-2019
 */


package com.explorechoice.javabasics;

public class DefaultAccessModifier {
	
	int x;
	private double y;
	
	public void add() {
	
		double r = x + y;
		System.out.println(r);
	}
	
	public void sub() {
		
		double r = x - y;
		System.out.println(r);
	}
	
	public void setX(int a) {
		x = a;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(double a) {
		y = a;
	}
	
	public double getY() {
		return y;
	}
	
	
	
	
	public static void main(String args[]) {
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.x = 23;
		obj.y = 60;
		obj.add();
		obj.sub();
		
	}
	
	
	

}


