/**
 * @author gaurnitai
 * @created_date 20-Oct-2019
 */


package com.amazon.javamethods;

//-- IN TWO DIFFERENT CLASSES ____
//instance v -------> instance method --- directly not possible - need to create object 
//static v -------> static method --- directly not possible- also not with object -- but need to use Class Name 
//instance v -------> static method --- directly not possible - need to create object
//static  v -------> instance method --- directly not possible- also not with object -- but need to use Class Name
//
//
//instance method -------> instance method --- directly not possible - need to create object 
//static method -------> static method --- directly not possible- also not with object -- but need to use Class Name 
//instance method -------> static method --- directly not possible - need to create object
//static  method -------> instance method --- directly not possible- also not with object -- but need to use Class Name
//

class InstanceMethodVariablesTest {
	
	void myInstanceMethodTest() {
		InstanceMethodVariables imv = new InstanceMethodVariables();
		System.out.println(imv.y);
	// to access instance v in instance method -- we need to use object 
		// WHEN WE ARE CALLING ONE CLASS MEMEBERS IN ANOTHER CLASS
		System.out.println(InstanceMethodVariables.x); 
		
		imv.myInstanceMethod();
		InstanceMethodVariables.myStaticMethod();
		
	}
	
	
	public static void main(String args[]) {
		System.out.println(InstanceMethodVariables.x);
	InstanceMethodVariables imv = new InstanceMethodVariables();
		System.out.println(imv.y);
		
		InstanceMethodVariables.myStaticMethod();
		imv.myInstanceMethod();
		
	}
	
	
	
	

}


