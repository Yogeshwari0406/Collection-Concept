package org.list;

import java.util.ArrayList;

public class FunctionsOfArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);//this is stored as integer object. allows any datatype
		al.add(20);
		al.add("Yogi");
		al.add(50);
		al.add("Veera");
		al.add("Yogi");
		al.add(1, "Addd");
		al.add(1, "yogi");
		al.add("Yogi");
		al.add("Yogii");
		System.out.println(al);
		//al.clone();// doubt why using this
		//al.clear();
		al.set(7, "Exchanged");
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf("Yogi"));
		System.out.println(al.indexOf("Yogi"));
		System.out.println(al.get(0));
		System.out.println(al.contains("Yogi"));
		al.remove("Yogii");
		System.out.println(al.remove(al));
		System.out.println(al);
		System.out.println(al.subList(3, 6));
		//al.removeAll(al);//Doubttt veera will clear
		//System.out.println(al.clone());
		ArrayList bl = new ArrayList(); //LinkedList bl = new LinkedList(); - for this we no need to give b1.addAll(al) it will automatically take data form al
	    bl.addAll(al);
	    System.out.println(bl);
	}

}
