package com.javaday2;
import java.util.Scanner;

public class palinDrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       //Take input from the user
	       //Create instance of the Scanner class
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the number: ");  
	       String reverse = ""; 
	       String num = sc.nextLine(); 
	       int length = num.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + num.charAt(i);  
	      if (num.equals(reverse))  
	         System.out.println("The entered string " +num +" is a palindrome.");  
	      else  
	         System.out.println("The entered string " +num +"  isn't a palindrome.");

	}

}
