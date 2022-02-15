package prgrm1;

public class Employee {

	public void empName(String empName, int empId, String empAddress, double empSalary,long mobnum) {
		System.out.println("Employee name :" +empName);
		System.out.println("EmpID: "+empId);
		System.out.println("EmpAddress:"+empAddress);
		System.out.println("EmpSalary: "+empSalary);
		System.out.println("Mobile Num :"+mobnum);
		
		
		

	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empName("Yaas",213,"chennai",40000, 95141394);
				
	}

}
