package com.tka.logicbuilding;

public class Palindrome {
	public static void main(String[] args) {
		   System.out.println(isPalindrome(121));
			
		}
		
		static boolean isPalindrome(int x){
		    
		    int temp=x;
		    int rev=0;
		    
		    while(x>0){
		        
		        int digit=x%10;
		        rev=(rev*10)+digit;
		        x=x/10;
		    }
		    if(temp==rev){
		        return true;
		    }
		    else{
		        return false;
		    }
		}

}
