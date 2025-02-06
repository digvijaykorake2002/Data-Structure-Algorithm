package com.tka.logicbuilding;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
	
		int n1=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		n1=sc.nextInt();
		
		for(int i=1; i<=n1; i++) {
			
			
			if(i%2==0) {
				System.out.println("Even Number = "+i);
			}
		}
		for(int j=1; j<=n1; j++) {
			
			if(j%2!=0) {
				
				System.out.println("Odd Number = "+j);
				
			}
		}

	}

}
