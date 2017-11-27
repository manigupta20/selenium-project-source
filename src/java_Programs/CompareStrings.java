package java_Programs;

public class CompareStrings {

	public static void main(String[] args) {

		String s1 = "JAVA";
		String s2 = "java";
		String s3 = new String("JAVA");
		String s4 = "JAVA";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);



	}

}
