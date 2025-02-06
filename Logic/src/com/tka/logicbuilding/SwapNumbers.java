package com.tka.logicbuilding;

import java.util.*;
public class SwapNumbers {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Value of a");
		num1=sc.nextInt();
		
		System.out.println("Enter The Value of b");
		num2=sc.nextInt();
		
		
		//Swapping Logic With Help Of temp Variable
		
		int temp = num1;
		
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping....");
		
		System.out.println("value of a is " + num1);
		System.out.println("value of b is " + num2);
	}

}
