package com.tnsif.association.hasafinish;

public class person {
	package com.tnsif.association.hasa;

	public class person {
	private string name;
	private Address address;
	public person(string name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public string getName() {
		return name;
	}
	public void setName(string name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	///method to display person  info

	public void displayInfo()

	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+address.getstreet()+",");
		
		}

}
