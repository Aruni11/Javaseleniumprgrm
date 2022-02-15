package prgrm1;

public class Palindrome {

	public static void main(String[] args) {
	
			String str1=new String("Madam");
			String str2=new String("");
			int strLength=str1.length();
			for (int i = (strLength-1); i >=0; i--) {
				str2=str2+str1.charAt(i);
				}
			if(str1.equals(str2)){
				System.out.println(str1+" is a palindrome");
			}
			else {
				System.out.println(str1+ " is not a palindrome");
			}
		}
}
