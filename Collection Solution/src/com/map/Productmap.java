package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Productmap {

	public static void main(String[] args) {

		List puma = new ArrayList();
		puma.add("red");
		puma.add("Black");
		
		List reebok = new ArrayList();
		reebok.add("white");
		reebok.add("skyblue");

		HashMap shoes = new HashMap();
		shoes.put("Puma", puma);
		shoes.put("Reebok", reebok);

		List aurelia = new ArrayList();
		aurelia.add("Navyblue");
		aurelia.add("Pink");

		HashMap kurti = new HashMap();
		kurti.put("Aurelia", aurelia);

		HashMap product = new HashMap();
		product.put("Shoes", shoes);
		product.put("Kurti", kurti);

		HashMap prod = new HashMap();
		prod.put("Product", product);

		Set setOfProducts = prod.keySet();
		for (Object obj : setOfProducts) {
			String productKey = (String) obj;
			System.out.println(productKey);

			HashMap type = (HashMap) prod.get(productKey);

			Set setOfType = product.keySet();
			for (Object obj1 : setOfType) {
				String typekey = (String) obj1;
				System.out.println("\t" + typekey);

				HashMap brand = (HashMap) type.get(typekey);

				Set setOfBrand = brand.keySet();
				for (Object obj2 : setOfBrand) {
					String brandKey = (String) obj2;
					System.out.println("\t\t" + brandKey);

					List Color = (List) brand.get(brandKey);
					for (Object obj3 : Color) {
						String colors = (String) obj3;
						System.out.println("\t\t\t" + colors);
					}
				}
			}
		}
	}
}
