package org.set;

import java.util.HashSet;//Follows random order

public class FunctionsOfHashSet {
	public static void main(String[] args) {
		HashSet a = new HashSet();
		HashSet b = new HashSet();
		a.add(1000);
		a.add("Yogi");
		a.add("Veera");
		a.add(1000);//Won't allow duplicate so print only one time if duplicate is there
		a.add("Yogi");//Won't allow duplicate so print only one time if duplicate is there
		b.addAll(a);
		System.out.println(b);
		a.add(10);
		System.out.println(a);
		System.out.println(a.contains("Yogi"));
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.remove("Yogi"));
		System.out.println(a);//doubt removeif condition.
	
	}

}
