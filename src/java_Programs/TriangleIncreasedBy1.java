package java_Programs;

import java.util.Scanner;

public class TriangleIncreasedBy1 {

	public static void main(String[] args) {

	/*		
		1 
		23 
		456 
		78910 
		1112131415
   */
		Scanner s= new Scanner(System.in);
		System.out.println("Input number of rows : ");
		int n= s.nextInt();
		
		int i, j, k=1;
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=i; j++)
				System.out.print(k++);
				System.out.println(" ");
				
		}
	}

}
