package java_Programs;

import java.util.Scanner;

public class PrintTriangle {

	public static void main(String args[])
	{
		
	 /* 1 
		12 
		123 
		1234 
		12345  */
		
		Scanner s= new Scanner(System.in);
		System.out.println("Input number of rows : ");
		int n= s.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j);
			
				System.out.println(" ");
		}
		

		PrintTriangle.FloydTriangle();
		
	}
	
	/* 	1  
	    0 1  
     	1 0 1  
    	0 1 0 1  
	    1 0 1 0 1  */

	private static void FloydTriangle() {
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Input number of rows : ");
		int n= s1.nextInt();
		
		int i,j;
		
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print((i+j+1)%2 + " ");	
			}
			System.out.println(" ");

	
		}
		
		
	}
}
