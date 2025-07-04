package com.tnsif.daysix.staticmethod;

public class MyclassDemo {
	public static void main(String[] args) {
		
		Myclass.display();
		
		System.out.println();
		
		Myclass o1=new Myclass();
		System.out.println(o1);
		
		Myclass.display();
		
		Myclass o2=new Myclass();
		System.out.println(o2);
		
		
	}

}
