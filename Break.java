package prgrm1;

public class Break {

	public static void main(String[] args) {
		for (int i=1;i<=20;i++) {
			if(i==6) {
				System.out.println("six");
				continue;
		
			}
			else if(i==11) {
				break;
			}
			
			System.out.println(i);
	
		
		}
		

	}

}
