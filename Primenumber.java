package prgrm1;

public class Primenumber {

	public static void main(String[] args) {
		int a=15;
		int count=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count++;
				break;
				
			}
		}
if(count==0) {
	System.out.println("it is a prime number");
}
else {
	System.out.println("it is not a prime number");

}
	}

}
