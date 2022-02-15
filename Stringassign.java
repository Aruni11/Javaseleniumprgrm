package prgrm1;

public class Stringassign {

		public static void main(String[] args) {
			String text1=new String("stops");
			String text2=new String("potss");
			boolean status=true;
			if(text1.equals(text2)) {
				System.out.println("same");
			}
			else {
				System.out.println("not same");
			}
			
			if(text1.length()==text2.length()) {
				System.out.println("same");
			}
			else {
				System.out.println("not same");
			}
			
			char[] charArray1=text1.toCharArray();
			char[] charArray2=text2.toCharArray();
			System.out.println(charArray1);
			System.out.println(charArray2);
			
			
			
			
				
			}
				
				

					
					
					

        
	}

