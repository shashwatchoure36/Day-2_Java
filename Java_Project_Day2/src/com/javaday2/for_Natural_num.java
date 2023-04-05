package com.javaday2;

import java.util.Scanner;

public class for_Natural_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        int num; //Declare the number
        System.out.println("Enter the number : ");
        num=sc.nextInt();    //Initialize the number
        
		
		int i, sum = 0;  
		//executes until the condition returns true  
		for(i = 1; i <= num; ++i)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		}  
		//prints the sum   
		System.out.println("Sum of Natural Numbers is = " + sum);  

	}

}
