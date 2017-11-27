package java_Programs;

import java.util.Scanner;

public class MultiplicationOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("Main Method Executed");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int x = in.nextInt();
		System.out.println("Multiplication of two numbers are");
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(x+ "*" +i+ "=" + (x*i) );
		}
		
	}
	
	static
	{
		System.out.println("Static Block is Executed before main method");
		
	}

}
