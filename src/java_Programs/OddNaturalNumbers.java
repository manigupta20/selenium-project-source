package java_Programs;

import java.util.Scanner;

public class OddNaturalNumbers {

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		System.out.println("Input the number of terms: ");
		int n=in.nextInt();
		System.out.println("Odd numbers are");
		
		int sum=0;
		for(int i=1; i<=n; i++)
		{
		System.out.println(2*i-1);
		sum+=2*i-1;
		}
			
		System.out.println("The Sum of Odd Nautral Numbers " +n+ " terms is: " +sum);
		
	}

}
