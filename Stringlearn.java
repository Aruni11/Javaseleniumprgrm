package prgrm1;

public class Stringlearn {

	public static void main(String[] args) {
		String str1=new String("Notebooks is used to take a notes");
		String str2=new String("Notebooks is used to take a notes");
		int length=str1.length();
		
		System.out.println(length);
		char[] charArray=str1. toCharArray();
		System.out.println(charArray);
		System.out.println(str1.contains("book"));
		System.out.println(str1.charAt(10));
		System.out.println(str1.indexQf""));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1==str2);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println("Tip:" +str1);
		System.out.println("important: "+str1.toUpperCase());

	}

}
