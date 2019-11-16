/**
 * @author gaurnitai
 * @created_date 09-Nov-2019
 */


package com.explorechoice.javabasics;

class TestDefaultAccessModifier {
	
	public static void main(String args[]) {
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.x = 23;  // setting 
		obj.setX(23);
		System.out.println(obj.getX());// 23
		obj.setY(60);
		System.out.println(obj.getY());// 60
		obj.add(); //  83.0
		obj.sub(); // -37.0
		
		ConstructorExample ce = new ConstructorExample(23, 60, 70);
		ce.add(); //  83.0
		ce.sub(); // -37.0
		System.out.println(ce.d); // 70
		
		
		
		
		ConstructorExample ce1 = new ConstructorExample();
		ce1.add(); //  50.0
		ce1.sub(); //  -10.0
		System.out.println(ce1.d); //45
		
		
	}
	

}


