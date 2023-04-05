package com.javaday2;
import java.util.Scanner;

public class spring_Session {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Month");
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Day");
		
		
		
		
		
        int Month = sc.nextInt();
        int Day   = sc1.nextInt();
        boolean isSpring =  (Month == 3 && Day >= 20 && Day <= 31)
                         || (Month == 4 && Day >=  1 && Day <= 30)
                         || (Month == 5 && Day >=  1 && Day <= 31)
                         || (Month == 6 && Day >=  1 && Day <= 20);

        System.out.println(isSpring);

	}

}
