package prgrm1;

public class ReverseEvenwords {
	public static void main(String[] args) {
		String a="I am a software tester";
		String[] b = a.split(" ");
		for (int i = 1; i < b.length; i +=2)
		    b[i] = new StringBuilder(b[i]).reverse().toString();
		System.out.println(String.join(" ", b));
	}

}

