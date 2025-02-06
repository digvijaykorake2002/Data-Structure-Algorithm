package com.tka.logicbuilding;

import java.io.InputStream;
import java.util.Scanner;

public class PassOrFailQuetion {

	public static void main(String[] args) {
		
		byte m1,m2,m3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Marks Of Physics");
		m1 = sc.nextByte();
		
		System.out.println("Enter Marks Of Chemistry");
		m2 = sc.nextByte();
		
		System.out.println("Enter Marks Of Mathematics");
		m3 = sc.nextByte();
		
		float  avg= (m1+m2+m3)/3.0f;
		
		if (  avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			
			System.out.println("Congratulations ! You Are Eligible For Apply");
			
		
		}
		else {
			
			System.out.println("Sorry ! You Are Not Eligible ");
			 
			
		}
		System.out.println("Your Overall Average is : " + avg);
		System.out.println("You Are Obtained Marks As Per Subject : "+ " Physics = "+m1+" Chemistry = "+m2+ " Mathematics = " +m3);
				
	}


}