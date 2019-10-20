
package com.amazon.javamethods;


public class InstanceMethodVariables {

	static int x; // static variable  // Static variable is a class level variable

	int y = 300; // instance variable / non-static // is a object level variable

	static void myStaticMethod() {
		InstanceMethodVariables imv = new InstanceMethodVariables();
		System.out.println(imv.y);

	}
	
	void myInstanceMethod() {
		System.out.println(y); // instance variable can be called in instance methods
		System.out.println(x); // static variable can be called in instance methods
	}

}
