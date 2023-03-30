package org.list;

import java.util.LinkedList;

public class FunctionsOfLinkedList {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(10);//this is stored as integer object. allows any datatype
		al.add(20);
		al.add("Yogi");
		al.add(50);
		al.add("Veera");
		al.add("Yogi");
		al.add(1, "Addd");
		al.add("Yogi");
		al.add("Yogii");
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf("Yogi"));
		System.out.println(al.indexOf("Yogi"));
		System.out.println(al.get(0));
		System.out.println(al.contains("Yogi"));
		al.remove("Yogii");
		System.out.println(al.remove(al));
		System.out.println(al);
		System.out.println(al.subList(3, 6));
		al.addFirst("Hahaha");
		al.addLast(10000);
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		//System.out.println(al.removeFirst());
		//System.out.println(al.removeLast());
		System.out.println(al);
//		al.pollFirst();//same as like remove First
//		al.pollLast();//Same as like Remove Last
//		System.out.println(al);
//		al.offerFirst("All is Well");//same like addFirst
//		al.offerLast("Success");//Same like AddLast
		al.offer("All is Well");//same like add Last, OfferLast
		System.out.println(al);
	}
	

}
