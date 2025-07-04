package com.tnsif.daysix.staticmethod;

public class Employee {
	//declare instance variable
	private String name;
	private int id;
	
	//Declare a static companyName with data type string 
	static String companyname="TNSIF";
     
	
	public Employee() {
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id +"CompanyName"+companyname+ "]";
	}
	
	
	

	
	
	

}
