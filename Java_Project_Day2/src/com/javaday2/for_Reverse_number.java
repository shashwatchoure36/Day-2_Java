package com.javaday2;

import java.util.Scanner;

public class for_Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        int num; //Declare the number
        System.out.println("Enter the number : ");
        num=sc.nextInt();    //Initialize the number
		
		
	
		int  reverse = 0;  
		//we have not mentioned the initialization part of the for loop  
		for( ;num != 0; num=num/10)   
		{  
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
