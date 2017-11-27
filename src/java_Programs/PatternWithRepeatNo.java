package java_Programs;

import java.util.Scanner;

public class PatternWithRepeatNo {

	public static void main(String[] args) {
		
	/*	1 
		22 
		333 
		4444 
		55555 	*/	
		
		Scanner s= new Scanner(System.in);
		System.out.println("Input number of rows : ");
		int n= s.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print(i);
				System.out.println(" ");
				
		}
	
	}

}
