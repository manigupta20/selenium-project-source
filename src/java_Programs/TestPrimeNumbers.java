package java_Programs;

import java.util.Scanner;

public class TestPrimeNumbers {

	public static void main(String[] args) {

		int n, num =3;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number between 1 and 100");
		n = in.nextInt();
		
		if(n>1)
		{
			System.out.println("Enter the number of prime numbers you want");
		}
		for(int i=2; i<=n; )
		{
			for(int j=2; j<=Math.sqrt(num); j++)
			{
				if(num%j==0)
				{
					System.out.println();
				}
			}
		}
	}

}
