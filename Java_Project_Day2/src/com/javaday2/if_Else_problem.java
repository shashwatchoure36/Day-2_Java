package com.javaday2;
import java.util.Scanner;

public class if_Else_problem {
	
	   // Strings at index 0 is not used, it is to make array
    // indexing simple
    static String one[] = { "", "ONE ", "TWO ", "THREE ", "FOUR ",
                            "FIVE ", "SIX ", "SEVEN ", "EIGHT ",
                            "NINE ", "TEN ", "ELEVEN ", "TWELVE ",
                            "THIRTEEN ", "FOURTEEN ", "FIFTEEN ",
                            "SIXTEEN ", "SEVENTEEN ", "EIGHTEEN ",
                            "NINETEEN " };
 
    // Strings at index 0 and 1 are not used, they are to
    // make array indexing simple
    static String ten[] = { "", "", "twenty ", "thirty ", "forty ",
                            "fifty ", "sixty ", "seventy ", "eighty ",
                            "ninety " };
 
    // n is 1- or 2-digit number
    static String numToWords(int n, String s)
    {
        String str = "";
        // if n is more than 19, divide it
        if (n > 19) {
            str += ten[n / 10] + one[n % 10];
        }
        else {
            str += one[n];
        }
 
        // if n is non-zero
        if (n != 0) {
            str += s;
        }
 
        return str;
    }
 
    // Function to print a given number in words
    static String convertToWords(long n)
    {
        // stores word representation of given number n
        String out = "";
 
        // handles digits at ten millions and hundred
        // millions places (if any)
        out += numToWords((int)(n / 10000000), "CRORE ");
 
        // handles digits at hundred thousands and one
        // millions places (if any)
        out += numToWords((int)((n / 100000) % 100), " LAC ");
 
        // handles digits at thousands and tens thousands
        // places (if any)
        out += numToWords((int)((n / 1000) % 100), "THOUSAND ");
 
        // handles digit at hundreds places (if any)
        out += numToWords((int)((n / 100) % 10), "HUNDRED ");
 
        if (n > 100 && n % 100 > 0) {
            out += "and ";
        }
 
        // handles digits at ones and tens places (if any)
        out += numToWords((int)(n % 100), "");
 
        return out;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // long handles upto 9 digit no
        // change to unsigned long long int to
        // handle more digit number
        Scanner conin=new Scanner(System.in);
        System.out.println("Enter single digit number:");
        String[] array = {"exit/quit","ONE", "TWO", "THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        int a=conin.nextInt();
        System.out.println("You have entered number:"+array[a]);
		
        long n = 110100100;
 
        // convert given number in words
        System.out.printf(convertToWords(n));
        

		

	}

}
