package java_Programs;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {

		int i, fact=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find factorial of it.");
		int num = in.nextInt();
		
		for(i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of a number is :" + fact);
	}
}