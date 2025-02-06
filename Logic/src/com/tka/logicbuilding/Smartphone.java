package com.tka.logicbuilding;

//	interface Camera {
//		
//		void photo();
//	    void video();
//	}
//	
//	interface call{
//		
//	 void simone();
//	 void simtwo();
//	}
//	 
//	 public class Smartphone implements Camera,call {
//		 
//		 public void photo() {
//			 System.out.println("Capturing photo......"); 
//		 }
//		 
//		 public void video() {
//			 
//			 System.out.println("Recording video.....");
//			 
//		 }
//		 
//		 public void simone() {
//			 System.out.println("Calling on sim one...");
//		 }
//		 
//		 public void simtwo() {
//			 System.out.println("calling on sim  two.....");
//		 }
//	
//	 
//	 
//	
//	
//	
//	public static void main(String[] args) {
//		
//		Smartphone phone= new Smartphone();
//		
//		phone.simone();
//		
//		
//
//	}
//	 }
//	 



//Problem 2 :-
class NegativeRadiusException extends Exception{
    
    public String toString(){
        
        return "Negative Value not Allowed";
        
    }
    
    public String getMeassage(){
        
        return "Negative Radius Can Not Be defined";
        
    }
}
    
     
public class Smartphone
{
	 public static double Area(int r) throws NegativeRadiusException{
         
         
         if(r<0){
             
             throw new NegativeRadiusException();
         }
         
          return Math.PI * r * r;
         
         
           
     }
	public static void main(String[] args) {
	    
		try {
		double a=Area(1);
	     System.out.println(a);
		}catch(Exception e) {
			System.out.println(e);
		}

	}
}

//Problem 3:-




