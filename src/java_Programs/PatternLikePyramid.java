package java_Programs;

import java.util.Scanner;

public class PatternLikePyramid {
	
	public static void main(String args[])
	{

	/*	
			1 
	       2 2 
	      3 3 3 
	     4 4 4 4 
	    5 5 5 5 5 
   */
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		
		int k=n+4-1;
		
		for(int i=1; i<=n; i++)
		{
			for(int m=k; m!=0; m--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++ )
	        {
	            System.out.print(i+ " ");
	        }
			System.out.println();
			k--;
		}
		
		PatternLikePyramid.printTriangle();
		PatternLikePyramid.reverseTriangle();
		
	}

/*
		 *
	    ***
	   *****
	  *******
	 *********
*/
	public static void printTriangle()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the number");
		int n1= s1.nextInt();
		
		for(int i=1; i<=n1; i++)
		{
			for(int j=n1; j>=i; j--)		
			{
				System.out.print(" ");
			}
			for(int k=1; k<=((2*i)-1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

/*	
	*********
	 *******
	  *****
	   ***
	    *
*/
	public static void reverseTriangle()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the number");
		int n1= s1.nextInt();
		
		for(int i=n1; i>=1; i--)
		{
			for(int j=n1; j>i; j--)		
			{
				System.out.print(" ");
			}
			for(int k=1; k<(2*i); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
	

