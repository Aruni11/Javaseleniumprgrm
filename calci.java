package prgrm1;

public class calci {

	public static void addTwonumber() {
		int a=10;
		int b=12;
		int c=a+b;
		System.out.println(c);

	}
	public static void subTwonumber() {
		int a=11;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	public static void mulTwonumber() {
		int a=11;
		int b=2;
		int c=a*b;
		System.out.println(c);
		
	}
	public static void divTwonumber() {
		int a=10;
		int b=05;
		int c=a/b;
		System.out.println();
	}
	public static void main(String[]args) {
		calci calc=new calci();
		calc.addTwonumber(10,20);
		calc.subTwonumber();
		calc.mulTwonumber();
		calc.divTwonumber();
		
		
				
	}

}