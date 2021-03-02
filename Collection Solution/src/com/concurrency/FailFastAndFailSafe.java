package com.concurrency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class FailFastAndFailSafe {

	public static void main(String[] args) {
 //_____________________________ Fail Fast ___________________________________________ 
		
		/*HashMap hm=new HashMap();
		hm.put("pune",12);
		hm.put("Yavatmal", 29);
		
		Set s=hm.keySet();
		
		Iterator itr=s.iterator();           // Fail fast
		while(itr.hasNext()) {
			hm.put("Solapur", 13);  //java.util.ConcurrentModificationException
			Object obj=(Object) itr.next();
			System.out.println(obj);*/
		
// _____________________________ Fail Safe ____________________________________________		
		
		ArrayList list=new ArrayList();
		list.add(14);
		list.add(15);
		list.add("abc");
		
		ListIterator itr=list.listIterator();       // Fail Safe
		while(itr.hasNext()) {
			itr.add(60);
			Object obj=itr.next();
			System.out.println(obj);
		}
	}
}


