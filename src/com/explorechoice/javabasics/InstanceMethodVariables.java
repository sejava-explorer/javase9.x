/**
 * @author gaurnitai
 * @created_date 20-Oct-2019
 */

	// instance v -------> instance method --- GOOD to go
	// static v -------> static method --- GOOD to go
	// instance v -------> static method --- NOT GOOD to go directly --- but yes
	// with the help of object we can access
	// static v -------> instance method --- GOOD to go

	// instance method -------> instance method --- GOOD to go
	// static method -------> static method --- GOOD to go
	// instance method -------> static method --- NOT GOOD to go directly --- but
	// yes with the help of object we can access
	// static method -------> instance method --- GOOD to go
	//

package com.explorechoice.javabasics;

public class InstanceMethodVariables {

	static int x; // static variable

	int y = 300; // instance variable / non-static

	static void myStaticMethod() {
		InstanceMethodVariables imv = new InstanceMethodVariables();
		System.out.println(imv.y);

	}
	
	void myInstanceMethod() {
		System.out.println(y); // instance variable can be called in instance methods
		System.out.println(x); // static variable can be called in instance methods
	}
	

	// Method with no return type and no parameter
	void add() { // non-static
		System.out.println(y); // instance variable can be called in instance methods
		System.out.println(x); // static variable can be called in instance methods
	}

	// Method with no return type and parameter
	void sub(int x, int y) {
		add();

	}

	// Method with return type and no parameter
	int mul() {
		int x = 80;
		int y = 50;
		int z = x * y;
		return z;
	}

	// Method with return type and parameter

	int mul(int a, int b) {
		int x = a;
		int y = b;
		int z = x * y;
		return z;
	}
	
	public static void main(String args[]) {
		InstanceMethodVariables imv = new InstanceMethodVariables();
		System.out.println(imv.y); // failed

		System.out.println(x); // static variable can be called in static methods

		myStaticMethod();
		imv.add();

	}

}
