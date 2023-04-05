package com.javaday2;
import java.util.Scanner;

public class while_Sum_natural {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num; //Declare the number
        System.out.println("Enter the number : ");
        num=sc.nextInt();    //Initialize the number
        
       //Variable to calculate the sum
        int i = 1, sum = 0;  
        while(i <= num)  
        {  
        //adding the value of i into sum variable  
        sum = sum + i;  
        //increments the value of i by 1  
        i++;  
        }  
        //prints the sum   
        System.out.println("Sum of Natural Numbers is = " + sum);  

	}

}
