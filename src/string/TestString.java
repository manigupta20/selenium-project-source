package string;

import java.util.Locale;

public class TestString {

	static int m =10;
	int j = 20;

	public static void test()
	{
		m = 30;
	//	j= 40;
	}	
	public void test1()
	{
	  m= 20;
	  j = 50;
	}
		
	public static void main(String[] args) {
		TestString t = new TestString();
		
		TestString.test();
		t.test1();
		
			String str = new String("Strings are immutable");
			System.out.println(str.charAt(8));
			
			String str1 = "Strings are immutable";
			String str2 = new String("Strings are immutable");
			String str3 = new String(" Integers are not Immutable");
			String str4 = "strings Are Immutable";
			
			int result = str1.compareTo(str2);
			System.out.println(result);                                // Str1 is equals to Str2 then result is zero			
			System.out.println(str2.compareTo(str3));                  // Str2 is smaller than Str3 then result is positive
			System.out.println(str3.compareTo(str1));				  // Str3 is larger than Str4 then result is negative
			System.out.println(str1.compareToIgnoreCase(str4));		  //  compareToIgnoreCase is used to ignore case
			System.out.println(str.concat(str3));
			System.out.println(str1.contentEquals(str2));
			System.out.println(str2.contentEquals(str3));
			
			char[] str5 = {'h', 'e', 'l', 'l', 'o', '+', 'w', 'o', 'r', 'l', 'd'};
			String str6 = "";
			str6 = str6.copyValueOf(str5);
			System.out.println(str6);
			
			System.out.print("Return Value: ");
			System.out.println(str2.toCharArray());
			System.out.print("LoweCase Value:");
			System.out.println(str3.toLowerCase());
			System.out.print("UpperCase Value: ");
			System.out.println(str4.toUpperCase());
			System.out.println(str6.toString());              // This method return itself
			System.out.println("Return Length: "+ str3.length());
			System.out.println(str.substring(1, 10));
			
			
			String str7 = "   Integers are not Immutable   ";
			System.out.println(str1.trim());                 // If a string have space then it will remove that space
			
			int i = 5656;
			boolean b = true;
			System.out.println("Return Value: "+ String.valueOf(i) );
			System.out.println("Return Value: "+ String.valueOf(b));
	}

}
