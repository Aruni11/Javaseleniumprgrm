package prgrm1;

public class fibonacci {

	public static void main(String[] args) {
		int first=0;
		System.out.println(first);
		int second=2;
		System.out.println(second);
		 
		for (int i=2;i<=10;i++) {
			int sum=first+second;
			System.out.println(sum);
			first=second;
			second=sum;
			
		}

	}

}
