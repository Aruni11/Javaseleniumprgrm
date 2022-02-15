package prgrm1;

public class calci2 {

	public static void addTwonumber (int a, int b) {
		int c=a+b;
		System.out.println(c);

	}
	public static void subTwonumber (int a, int b) {
		int c=a-b;
		System.out.println(c);
	
	}
	public static void main(String[] args) {
		calci2 calc= new calci2();
		calc.addTwonumber(10, 10);
		calc.subTwonumber(13, 10);
	}
	

}
