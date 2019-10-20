
package com.explorechoice.javabasics;

import java.util.Scanner;

public class Paramethod {
	
	double a,b,c;
	
	 double add (double x, double y, double z)
	 {  
		//a = x;
//		b = y;
//		c = z;
		double res= x+y+z;
		
		//double res= a+b+c;
		return res;
	}
	
	void Avrg()
	{
		double m,n,o,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no:" );
		m=sc.nextDouble();
		System.out.println("Enter 2nd no:" );
		n=sc.nextDouble();
		System.out.println("Enter 3rd no:" );
		o=sc.nextDouble();
		
		f=add(m,n,o);
		
		//double Avg=f/3;
		System.out.println("addn is: "+ " "+f);
	}
	
	public static void main(String[] args) {
		
		Paramethod pm= new Paramethod();
		double res = pm.add(20, 30, 40);
		pm.Avrg();  // 40, 50, 60  
	}
}


