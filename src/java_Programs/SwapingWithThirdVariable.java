package java_Programs;

import java.util.Scanner;

public class SwapingWithThirdVariable {

	public static void main(String[] args) {
		
		int x, y, temp;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input x and y");
		
		x = in.nextInt();
		y = in.nextInt();
		
		System.out.println("Before Swapping numbers are: " + "\n x="+x + "\n y="+y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swapping numbers are: " + "\n x="+x + "\n y="+y);

	}

}


/*
 *  If value of x=5 and y=10, then values will be swap as below:
 *  temp=x => temp=5
 *  x=y => x=10
 *  y=temp => y=5
 *  
 */