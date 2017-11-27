package java_Programs;

import java.util.Scanner;

public class FindOddEvenNo {

	public static void main(String[] args) {
		
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer to check if it is odd or even");
		x = in.nextInt();
		
		if(x%2==0)
		{
			System.out.println("Entered no. is even number");
		}
		else
		{
			System.out.println("Entered no. is odd number");
		}
	}

}
