package java_Programs;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {

		String original = "12321";
		String reverse="";
		
	//	String original, String reverse;		
	//	Scanner in = new Scanner(System.in);		
	//	System.out.println("Enter a input string");
	//	original = in.nextLine();
		
		int length= original.length();
		
		for(int i=length-1; i>=0; i--)
		reverse = reverse + original.charAt(i);
		System.out.println("Reversed String is as:"+ reverse);
		
		if(original.equals(reverse))
		{
			System.out.println("Entered String is Palindrome");
		}
		else
		{
			System.out.println("Entered String is not Palindrome");
		}
	}

}


/*
 * Java palindrome program: Java program to check if a string is a palindrome or not. 
 * Remember a string is a palindrome if it remains unchanged when reversed, 
 * for example "dad" is a palindrome as reverse of "dad" is "dad" whereas "program" is not a palindrome. 
 * Some other palindrome strings are "mom", "madam", "abcba".
 */
