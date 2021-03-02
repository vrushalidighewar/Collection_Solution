package com.concurrency;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConcurrentProcessSet {
	public static void main(String[] args) {

		Set s = new HashSet();
		s.add(123);
		s.add("abc");
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			s.add(55);
			Object obj=(Object) itr.next();
			System.out.println(obj);
		}
	}
}