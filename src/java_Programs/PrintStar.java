package java_Programs;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		
  /*    *****
		 ****
		  ***
		   **
		    *  
  */		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();

		for(int i=n; i>0; i--)
		{
			for (int spc=n-i; spc>0; spc--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		PrintStar star=new PrintStar();
		star.printStar();
		star.printTriangle();
		star.printReverseTriangle();
		
	}	

/*	
	* 
	** 
	*** 
	**** 
	***** 
*/
	public void printStar() {

		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s1.nextInt();

		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print("*");
			    System.out.println(" ");
		}
		
	}
	
/*		 @                                                  
    	@@                                                  
   	   @@@                                                  
  	  @@@@                                                  
 	 @@@@@                                                  
*/
	
	public void printTriangle() {

		Scanner s2= new Scanner(System.in);
		System.out.println("Enter the number");
		int nm = s2.nextInt();

		int i, j, s;
		
		for(i=0; i<nm; i++)
		{
			for(s=nm-i; s>0; s--)
			{
				System.out.print(" ");
			}
			for(j=0; j<=i; j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}

/*	                                                                                                                                     
	 @@@@@ 
	 @@@@
	 @@@  
	 @@ 
	 @                                              
*/
		
		public void printReverseTriangle() {

			Scanner s3= new Scanner(System.in);
			System.out.println("Enter the number");
			int n1 = s3.nextInt();

			int i,j;
			for(i=n1; i>=1; i--)
			{
				for(j=1; j<=i; j++)
				{
					System.out.print("@");
				}
				System.out.println();
			}
			
	}

}
