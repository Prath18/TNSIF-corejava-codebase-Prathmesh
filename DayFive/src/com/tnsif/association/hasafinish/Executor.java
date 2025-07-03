package com.tnsif.association.hasafinish;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address=new Address("405 Laxmi Nagar","Pune","Maharashtra","411001");
				
				Person p=new person("Aditya", address);
				p.displayInfo();
				System.out.println(p);
	}

}
