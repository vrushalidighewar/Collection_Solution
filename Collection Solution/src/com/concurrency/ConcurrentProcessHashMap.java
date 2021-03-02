package com.concurrency;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentProcessHashMap {

	public static void main(String[] args) {

		/*HashMap hm=new HashMap();
		hm.put("pune",12);
		hm.put("Yavatmal", 29);
		
		Set s=hm.keySet();
		
		Iterator itr=s.iterator();           // Fail fast
		while(itr.hasNext()) {
			hm.put("Solapur", 13);  //java.util.ConcurrentModificationException
			Object obj=(Object) itr.next();
			System.out.println(obj);*/
			
		 ConcurrentHashMap chs=new ConcurrentHashMap();
		 chs.put("Pune", 12);
		 chs.put("Yavatmal", 29);
		 
		 Set s=chs.keySet();
		 
		 Iterator itr=s.iterator();
		 while(itr.hasNext()) {
			 chs.put("Nashik", 15);
			 Object obj=(Object) itr.next();
			 System.out.println(obj);
			 
			 
		 }

	}

}
