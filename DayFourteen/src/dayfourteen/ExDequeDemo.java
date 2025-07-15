package dayfourteen;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeDemo {

	public static void main(String[] args) {
	
		Deque<String> deque1=new ArrayDeque<String>();
		deque1.add("Gautam");
		deque1.add("Rahul");
		deque1.add("Shreya");
		deque1.add("Aditya");
		
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str : deque1)
		{
			System.out.println("queue is :"+ str);
		}
		
		System.out.println(deque1);
		

	}

}