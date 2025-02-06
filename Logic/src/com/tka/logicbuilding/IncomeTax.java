package com.tka.logicbuilding;

import java.util.Scanner;
/* Question: income tax calculator for tax paid by employee
 * 
 * for income less than 2.5 lakhs = no tax
 * 
 * for income between 2.5 lakhs to 5 lakhs = 5% tax
 * 
 * for income between 5 lakhs to 10 lakhs = 20% tax
 * 
 * for income more than 10 lakhs = 30% tax
*/
public class IncomeTax {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Your Income In Lakhs : ");
		double income=sc.nextDouble();
		
		double tax=0;
		
		if(income<=250000){
			
			tax=tax+0;
	}
		else if (income>250000 && income<=500000) {
			
			tax=0.05*income;
		}
		else if (income>500000 && income<=1000000) {
			
			tax=0.2 *income;
		}
		else if (income>1000000) {
			
			tax=  0.3* income;
}
		System.out.println("Total Tax Is Paid By The Employee Is : " + tax);
}
}
