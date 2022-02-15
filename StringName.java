package prgrm1;

public class StringName {

	public int  z;
	public int  add() {
		int a=7;
		int b=2;
		z=a+b;
		System.out.println(z);
		return z;
	}
	public void getMobileBrand() {
		int x=5;
		System.out.println(x+z);
	}
	public boolean getCharged() {
		String str = "aruni";
		if(str.equals("aruni")) {
			System.out.println(true);
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(string[]args) {
		StringName str=new StringName();
		str.add();
		str.getCharged();
		str.getMobileBrand();
		
		}
		

	}

