

package com.explorechoice.javabasics;

class VariableTypes {
	double instVar ;   //Declaration of instance variable
	double instanceVar = 2435.09;
	//instVar = 45;   // This line of code will throw error because initilaization o instance variable cannot be done at class level
	//instanceVar = 5657.89; // This line of code will throw error because re-initilaization o instance variable cannot be done at class level
	
	void printInstanceVar() {
		instVar = 45;
		System.out.println(instVar);
	}
	
	double localVariable() {
		double x;
		x = 45;
		//System.out.println(x);
		return x;
	}
	
	void accessLocalVariable() {
		double x = localVariable();
		System.out.println(x);
	}

	public static void main(String args[]) {
		VariableTypes vt = new VariableTypes();
		vt.localVariable();
		vt.accessLocalVariable();
	}
	
	

}


