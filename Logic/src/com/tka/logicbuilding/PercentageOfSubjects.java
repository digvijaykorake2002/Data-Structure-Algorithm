package com.tka.logicbuilding;

import java.util.*;
public class PercentageOfSubjects {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter maths marks");
		int s1=sc.nextInt();
		System.out.println("enter cheistry marks");
		int s2=sc.nextInt();
		System.out.println("enter physics marks");
		int s3=sc.nextInt();
		System.out.println("enter history marks");
		int s4=sc.nextInt();
		System.out.println("enter english marks");
		int s5=sc.nextInt();
		
	
		int sum=s1+s2+s3+s4+s5;
		int percentage=sum*100/500;
		
		System.out.println("All subject percentage is: "+percentage+"%");

	}

}
