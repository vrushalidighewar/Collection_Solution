package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class UniversityMap {

	public static void main(String[] args) {

		List electrical = new ArrayList();
		electrical.add("Vrushali");
		electrical.add("kajol");

		List electronics = new ArrayList();
		electronics.add("Motuu");
		electronics.add("Vaishnavi");

		HashMap bncoe = new HashMap();
		bncoe.put("Electrical", electrical);
		bncoe.put("Electronics",electronics);

		HashMap sgbau = new HashMap();
		sgbau.put("BNCOE", bncoe);

		HashMap main = new HashMap();
		main.put("SGBAU", sgbau);

		Set setOfUniversity = main.keySet();
		for (Object obj1 : setOfUniversity) {
			String universityKey = (String) obj1;
			System.out.println(universityKey);

			HashMap university = (HashMap) main.get(universityKey);

			Set setOfCollege = university.keySet();
			for (Object obj2 : setOfCollege) {
				String collegeKey = (String) obj2;
				System.out.println("\t" + collegeKey);

				HashMap college = (HashMap) university.get(collegeKey);

				Set setOfDept = college.keySet();
				for (Object obj3 : setOfDept) {
					String deptKey = (String) obj3;
					System.out.println("\t\t" + deptKey);

					List listOfStudents = (List) college.get(deptKey);
					for (Object obj4 : listOfStudents) {
						String students = (String) obj4;
						System.out.println("\t\t\t--" + students);
					}
				}
			}
		}
	}

}
