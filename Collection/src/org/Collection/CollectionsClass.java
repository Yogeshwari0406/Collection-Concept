package org.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsClass {
	public static void main(String[] args) {
		
	
   List<Object> a = new ArrayList<>();
	a.add("Yogi10");
	a.add(10);
	a.add(234.566f);
	a.add(10);
	a.add("Yogi10");
	a.add("Yogi10");
	a.add(6533.33d);
	a.add(10);
	a.add(6533.33d);
	
	System.out.println(a);
	
	List<Object> b = new ArrayList<>();
	b.add("yiog");
	b.addAll(a);
	System.out.println(b);
	
	int CountYogi10 = Collections.frequency(a, "Yogi10");
	int Count10 = Collections.frequency(a, 10);
    int CountDouble = Collections.frequency(a, 	6533.33d);
    System.out.println(CountYogi10);
    System.out.println(Count10);
    System.out.println(CountDouble);
    Object value = a.get(3);
    System.out.println(value);
    
    ListIterator<Object> s = a.listIterator();
 	System.out.println("Forward Direction");
    while(s.hasNext()){
    	Object Print = s.next();
    	System.out.println(Print);
    }
    System.out.println("Reverse Direction");
    while(s.hasPrevious()) {
    	Object Print = s.previous();
    	System.out.println(Print);
    }
    Iterator<Object> i = a.iterator();
    while(i.hasNext()) {
    	Object Print = i.next();
    	System.out.println(Print);
    }
 
	}
	}  //() - used method calling
       // {}- detailed statement pass panrathu 
       //  [] - array
       //<> - assin to Generics - used to declare datatype while passing in generics (angular bracket)
