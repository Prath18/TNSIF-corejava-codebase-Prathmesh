package com.tnsif.dayeight.nesteddemo;

public class NestedDemo implements OuterInterface , OuterInterface.InnerInterface {

	@Override
	public void calArea() {
		System.out.println("Outer Interface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("Inner Interface");
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
