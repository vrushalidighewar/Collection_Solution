package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenericTest {

	public static void genericMap(){

		List<String> pune = new ArrayList<String>();
		pune.add("Karvenagar");
		pune.add("Warje");

		HashMap<String, List<String>> mh = new HashMap<>();
		mh.put("Pune", pune);

		HashMap<String, HashMap<String, List<String>>> india = new HashMap<>();
		india.put("Maharashtra", mh);

		HashMap<String, HashMap<String, HashMap<String, List<String>>>> world = new HashMap<>();
		world.put("India", india);

		Set<String> setofcountries = world.keySet();
		for (String countryKey : setofcountries) {
			System.out.println(countryKey);

		HashMap<String, HashMap<String, List<String>>> countries = world.get(countryKey);
        
		Set<String> setofstates=countries.keySet();
		for(String stateKey : setofstates) {
			System.out.println("\t" +stateKey);
			
		HashMap<String, List<String>> states=india.get(stateKey);
		
		Set<String> setofcities=states.keySet();
		for(String cityKey : setofcities) {
			System.out.println("\t\t" +cityKey);
			
		List<String> listoflocations=states.get(cityKey);
		for(String area : listoflocations) {
			System.out.println("\t\t\t" +area);
		}
			
		}
		}
		}
	}

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("pqr");
		
		for(String s : list) {
			System.out.println(s); 
			
		}
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		System.out.println("_______________________");
		genericMap();
	} 
		
	
}
