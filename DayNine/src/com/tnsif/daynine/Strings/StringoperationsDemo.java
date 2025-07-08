package com.tnsif.daynine.Strings;

public class StringoperationsDemo {
	public static void main(String[] args) {
		String s1=new String("Indian");
		
		System.out.println(s1);
		
		String s2=s1.toUpperCase();
		System.out.println(s2);
		
		System.out.println(s1.length());
		
		int a=s2.length();
		
		String s3=s1.substring(1, 4);
		System.out.println("Substring is:"+s3);
		
		System.out.println("Trimmed data:"+s1.trim());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
		
		//String Comparison
		s2=new String(s1);
		
		//== --> Object reference
		//equals --> data
		
		System.out.println("case 1:"+s1.equals(s2));
		System.out.println("case 2:"+s1==s2);
		
	}

}
