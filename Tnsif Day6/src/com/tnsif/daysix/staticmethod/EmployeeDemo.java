package com.tnsif.daysix.staticmethod;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		//creating first object of class
		Employee e=new Employee("Prathmesh",1001);
		Employee.companyname="TNSIF";
				
		System.out.println(e);
		
	}

}
