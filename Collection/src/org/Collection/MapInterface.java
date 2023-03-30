package org.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		Map<Integer,String> a = new HashMap<>();
		a.put(20000, "Gopi");//1
		a.put(0, "Yogi");
		a.put(3, "Pilla");
		int size = a.size();//2 
		System.out.println(size);g
		String String = a.get(3);//3
		System.out.println(String);
		a.put(1, "papa");
		Set<Integer> keySet = a.keySet();//  4  return type set, because key wont allow duplicate
		System.out.println(keySet);
		Collection<String> values = a.values();// 5 value in any format, collection allow duplicates
		System.out.println(values);
	    Set<Entry<Integer, String>> entrySet = a.entrySet();//6
	    System.out.println(entrySet);
	    boolean containsKey = a.containsKey(0);//7
	    System.out.println(containsKey);
	    boolean containsValue = a.containsValue("papaa");//8
	    System.out.println(containsValue);
	}
}
