package com.javaday2;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        int num; //Declare the number
        System.out.println("Enter the number : ");
        num=sc.nextInt();    //Initialize the number
        
		int  reverse = 0;  
		while(num != 0)   
		{  
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
