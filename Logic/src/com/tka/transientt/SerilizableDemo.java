package com.tka.transientt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class SerilizableDemo{
	

	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1.stuRollno=5;
		s1.name="Digvijay";
		
		String filename = "D:\\Test";
		
		try {
			
			FileOutputStream foi=new FileOutputStream(filename);
			ObjectOutputStream oos=new ObjectOutputStream(foi);
			
			oos.writeObject(s1);
			
			oos.close();
			foi.close();
			
			System.out.println("Object File Saved Successfully");
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		

	}

}
