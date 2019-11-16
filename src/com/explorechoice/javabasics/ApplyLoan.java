
/* PROBLEM STATEMENT
Create a class with name ApplyLoan
Define necessary variables
Create function calculateLoanAmount() to calculate the loan amount can be given to individual based on Cibil Score & Current Salary
if cibil score between 50 and 70 then loan will be 50% of Individual Current Salary 
if cibil score between 70 and 90 then loan will be 80% of Individual Current Salary 
if cibil score greater than 90 then loan will be 100% of Individual Current Salary 
---------
cibilScore 
currentSalary
loanAmountToBePaid
----------
Create function checkCibilScore() to check cibil score based on
Taken Loan & Repay - 100 %  --- cibil score 100
Taken Loan & Repay - more than 90 %  --- cibil score 95
Taken Loan & Repay - more than 70% --- cibil score 80
Taken Loan & Repay - more than 50 % --- cibil score 55
Taken Loan & Repay - less than 50 % --- cibil score 35
----------
isTaken Yes
loanAmountTaken   100
loanAmountRepay 50 
cibilScore   55
--------
if isTaken -- No
loanAmountToBePaid --- 25% of current Salary
*/

package com.explorechoice.javabasics;

public class ApplyLoan {
   int cibilScore;  //0
   double currentSalary; // 10000
   double loanAmountToBePaid; //12500
	
   public void checkCibilScore(String ist, double lat, double lar, double sal){
	   String isTaken = ist; //NO
	   boolean isTrue;
	   currentSalary = sal; //10000
	   //int cibilScore;
	   double loanAmountTaken = lat;  //100
//	   loanAmountTaken = 100;
	   double loanAmountRepay = lar;   //100 
//	   loanAmountRepay = 50;
	   double percentAmountPaid = (loanAmountRepay/loanAmountTaken) * 100;
	   
	   if(isTaken=="Yes") {
		   isTrue = true;
	   }else {
		   isTrue = false;
	   }
	   
	   if(isTrue) {
		   if(percentAmountPaid == 100) {
			    cibilScore = 100;
		   } else {
			   if(percentAmountPaid > 90) {
				   cibilScore = 90;
			   }  
		   }
	   }else {
		   loanAmountToBePaid = currentSalary + (25/100) * currentSalary;
	   }
	  
   }
   
   void calculateLoanAmount(){
	   
	   if(cibilScore==100) {
		   loanAmountToBePaid = currentSalary + (100/100) * currentSalary;
	   }else {
		  
		   if(cibilScore==90) {
			   loanAmountToBePaid = currentSalary + (80/100) * currentSalary;
		   }
	   }
	   System.out.println(loanAmountToBePaid);//12500
	  
   }
	
	
	
	
}


