package prgrm1;

public class Charoccurance {

		public static void main(String[] args) {
			String str="Welcome to Chennai";
			int count=0;
			char a='n';
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)==a) {
					count++;
				}
				
				
			}
			System.out.println(a+" appears "+count+" times in the given statement.");

		}

	}

