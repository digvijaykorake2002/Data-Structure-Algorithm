package com.tka.logicbuilding;

public class ReverseArrayNumbers {

	public static void main(String[] args) {
		
		int []array= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Reverse Array is :");
		
		for(int i=array.length -1; i>=0; i--) {
			
			System.out.print(array[i] + " ");
		}

	}

}
