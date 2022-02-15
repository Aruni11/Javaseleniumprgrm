package prgrm1;

public class Intersection {

	public static void main(String[] args) {
		int[] a= {76,32,11,99,22};
		int[] b= {99,02,89,64,28,11};
		System.out.println("Intersection");
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(b[j]);
				}
			}
				
		}

	}

}
