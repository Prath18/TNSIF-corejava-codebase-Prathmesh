package com.tnsif.daysix.staticmethod;

public class Myclass {
	private int section; //non static variable or instance 
	private static int srNo; //static or class variable
	
	//static block
	static
	{
		System.out.println("----Within Static Block----");
		srNo=1000;
	// 	section ---Non static function cannot assign into static
	}

	public Myclass() {
		System.out.println("----Within Default Construcctor----");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "Myclass [serial No "+srNo+"section=" + section + "]";
	}
	//static method
	static void display()
	{
		//System.out.println("Section:"+section)); --non static
		System.out.println("Serial No:"+srNo);
	}
	
	

}
