package com.tka.logicbuilding;

import java.util.Scanner;

public class SwitchCaseEvenOdd {

	public static void main(String[] args) {
     
		int n1, operator;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A number");
		n1=sc.nextInt();
		
		System.out.println("1]Even 2]Odd");
		operator=sc.nextInt();				
		
		switch(operator) {
			
			case 1:
				for(int i=1; i<n1;i++) {
					if(i%2==0) {
						System.out.println(i);
					}
				}
				break;
				
			case 2:
				for(int i=1; i<n1;i++) {
					if(i%2!=0) {
						System.out.println(i);
					}
			}	
				break;
		}
	}

}
