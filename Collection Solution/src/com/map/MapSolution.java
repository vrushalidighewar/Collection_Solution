package com.map;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;

public class MapSolution {

	public static void main(String[] args) {

		List pune = new ArrayList();
		pune.add("karvenagar");

		List mumbai = new ArrayList();
		mumbai.add("thane");

		List patna = new ArrayList();
		patna.add("AAA");
		patna.add("BBB");

		HashMap mh = new HashMap();
		mh.put("Pune", pune);
		mh.put("Mumbai", mumbai);

		HashMap bihar = new HashMap();
		bihar.put("Patna", patna);

		HashMap india = new HashMap();
		india.put("Maharashtra", mh);
		india.put("Bihar", bihar);

		HashMap world = new HashMap();
		world.put("India", india);

		Set setOfCountries = world.keySet();
		for (Object obj1 : setOfCountries) {
			String countriesKey = (String) obj1;
			System.out.println(countriesKey);

			HashMap states = (HashMap) world.get(countriesKey);

			Set setOfStates = states.keySet();
			for (Object obj2 : setOfStates) {
				String statesKey = (String) obj2;
				System.out.println("\t" + statesKey);

				HashMap cities = (HashMap) states.get(statesKey);

				Set setOfCities = cities.keySet();
				for (Object obj3 : setOfCities) {
					String citiesKey = (String) obj3;
					System.out.println("\t\t" + citiesKey);
					
					

					List setOfLocations = (List) cities.get(citiesKey);
					for (Object obj4 : setOfLocations) {
						String location = (String) obj4;
						System.out.println("\t\t\t" + location);
					}
				}
			}
		}

	}

}
