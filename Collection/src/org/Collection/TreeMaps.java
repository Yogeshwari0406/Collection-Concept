package org.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		
	
	Map<Integer,String> a=new TreeMap<Integer,String>();
	//Map<Integer,String> a=new LinkedHashMap<Integer,String>();
	a.put(1, "a");
	a.put(4, "d");
	a.put(3, "c");
    Collection<String> values = a.values();
    System.out.println(values);
    Set<Entry<Integer, String>> entrySet = a.entrySet();
    System.out.println(entrySet);
    System.out.println(a);

}}
