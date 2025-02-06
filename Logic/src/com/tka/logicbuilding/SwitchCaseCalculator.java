package com.tka.logicbuilding;

import java.util.Scanner;


public class SwitchCaseCalculator {

	public static void main(String[] args) {
		
int n1,n2,operator;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number");
		n1=sc.nextInt();
		
		System.out.println("Enter The Second Number");
		n2=sc.nextInt();
		
		System.out.println("Enter The Operator 1: Add , 2: Substract, 3: Multiply , 4: Divide  ");
		operator = sc.nextInt();
		
		int result=0;
		switch(operator){
		    
		    case 1:
		        result=n1+n2;
		        break;
		        case 2:
		            result=n1-n2;
		            break;
		            case 3:
		                result=n1*n2;
		                break;
		                case 4:
		                    if( n2!=0){
		                    result=n1/n2;
		                    }
		                    else{
		                        System.out.println("Divisible by 0 is Incorrect");
		                    }
		                    break;
		                    
		                    default:System.out.println("Invalid Operation Are You Entered");
		                    
		                    
		                
		  
		    
		}
		System.out.println("result : "+ result);

	/* IF ELSE CALCULATOR 
	 * 
	 * 	
	
		int n1,n2,operator;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		n1=sc.nextInt();
		
		System.out.println("Enter the second number");
		n2=sc.nextInt();
		
		System.out.println("Select the operator 1] Add , 2] Sub, 3] Mul, 4] Divide ");
		operator=sc.nextInt();
		
		int result=0;
		
		if (operator == 1){
			
			result=n1+n2;
		}
		else if(operator == 2) {
			
			result=n1-n2;
		}
		else if(operator == 3) {
			
			result=n1*n2;
		}
		else if(operator == 4) {
			if(n2!=0) {
				result = n1/n2;
			}
			else {
				System.out.println("divisible by 0 is Incorrect ");
			}
		}
		
		System.out.println("result :"+ result);
		
		
		*/
		}

}
