package org.set;

import java.util.LinkedHashSet;//Follows inserstion order
import java.util.Set;

public class FunctionsOfLinkedHashSet {
	public static void main(String[] args) {
	
    Set<Object> a = new LinkedHashSet<Object>();
	//LinkedHashSet a = new LinkedHashSet();
	LinkedHashSet b = new LinkedHashSet();
	a.add(20);
	a.add("Veeraaa");
	a.add("Yogiii");
	a.add(40);
	b.addAll(a);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.containsAll(b));
	System.out.println(b);
	//b.clear();
	System.out.println(b);
	System.out.println(b.retainAll(a));
}
}
