package com.javaday2;

import java.util.Scanner;

public class Arithmetic_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		System.out.println("Enter first no: ");
		int a = num.nextInt();
		System.out.println("Enter second no: ");
		int b = num.nextInt();
		System.out.println("Enter third no: ");
		int c = num.nextInt();

		int Val_1, Val_2, Val_3, Val_4;
		Val_1 = a + b * c;
		System.out.println("First operation is: " + Val_1);
		Val_2 = c + a / b;
		System.out.println("Second Operation is: " + Val_2);
		Val_3 = a % b + c;
		System.out.println("Third operation is: " + Val_3);
		Val_4 = a * b + c;
		System.out.println("Fourth Operation is: " + Val_4);

		if (Val_1 > Val_2 && Val_1 > Val_3 && Val_1 > Val_4) {
			System.out.println(d + " This is max.");
		} else if (Val_2 > Val_1 && Val_2 > Val_4 && Val_2 > Val_4) {
			System.out.println(e + " This is max.");
		} else if (Val_3 > Val_1 && Val_1 > Val_2 && Val_3 > Val_4) {
			System.out.println(Val_3 + " This is max.");
		} else {
			System.out.println(Val_4 + " This is max.");
		}

		if (Val_1 < Val_2 && Val_1 < Val_3 && Val_1 < Val_4) {
			System.out.println(Val_1 + " This is min.");
		} else if (Val_2 < Val_1 && Val_2 < Val_3 && Val_2 < Val_4) {
			System.out.println(Val_2 + " This is min.");
		} else if (Val_3 < Val_1 && Val_3 < Val_2 && Val_3 < Val_3) {
			System.out.println(Val_3 + " This is min.");
		} else {
			System.out.println(Val_4 + " This is min.");
		}

	}

}
