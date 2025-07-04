package com.tnsif.daysix.finaldemo;

public class FinalVariable {
	//final int a=20;//final int x; //final instance variable must be initialize
	
	final int x=100;
	
	//declare a static blank final variable 
	final static int y;
	
	final static int z=10;
	
	//instance method
	void change()
	{
		//a=20;
//		x=30; final variable can't be change or re assign
//		z=50;	
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x +", y=" + y + "]";
	}
	static
	{
		y=20;
		//z=80;  once initialized can't be reassigned
		System.out.println("value of Y : "+ y);
	}
	

}
