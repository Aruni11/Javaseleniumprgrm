package prgrm1;

import java.util.Arrays;

public class ascending {

	public static void main(String[] args) {
		int[] value= {6,5,3,1,2,4};
		Arrays.sort(value);
		for (int i=value.length-1;i>=0;i--) {
			System.out.println(value[i]);
		}

	}

}
