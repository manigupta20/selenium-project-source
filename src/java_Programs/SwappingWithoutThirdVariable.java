package java_Programs;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {

		int x, y;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		x = in.nextInt();
		y = in.nextInt();
		
		System.out.println("Before Swapping numbers are :" + "\n x="+x+ "\n y="+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After Swapping numbers are :" + "\n x="+x+ "\n y="+y);

	}

}



/*	
 *  If x=10 and y=25 the it value will swap as below;
 *  x = x+y = 10+25 = 35 => x=35
 *  y = x-y = 35-25 = 10 => y=10
 *  x = x-y = 35-10 = 10 => x=25  
 *  So now the value after swapping would be: x=25 and y=10
 */