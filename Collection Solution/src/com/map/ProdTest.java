package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ProdTest {

	public static void main(String[] args) {
		
		List vrushali=new ArrayList();
		vrushali.add(1234567890L);
		
		List motu=new ArrayList();
		motu.add(9876543210L);
		
		HashMap electrical=new HashMap();
		electrical.put("Vrushali",vrushali);
		electrical.put("Motu", motu);
		
		HashMap bncoe=new HashMap();
		bncoe.put("Electrical", electrical);
		
		HashMap sgbau=new HashMap();
		sgbau.put("BNCOE", bncoe);
		
		HashMap university=new HashMap();
		university.put("SGBAU", sgbau);
		
		Set setOfUniversity=university.keySet();
		for(Object obj1 : setOfUniversity) {
			String universityKey=(String) obj1;
			System.out.println(universityKey);
			
		HashMap college=(HashMap) university.get(universityKey);
		
		Set setOfCollege=college.keySet();
		for(Object obj2 : setOfCollege) {
			String collegeKey=(String) obj2;
			System.out.println("\t" +collegeKey);
			
		HashMap dept=(HashMap) college.get(collegeKey);
		
		Set setOfDept=dept.keySet();
		for(Object obj3 : setOfDept) {
			String deptKey=(String) obj3;
			System.out.println("\t\t" +deptKey);
			
		HashMap student=(HashMap) dept.get(deptKey);
		
		Set setOfStudent=student.keySet();
		for(Object obj4 : setOfStudent) {
			String studentkey=(String) obj4;
			System.out.println("\t\t\t" +studentkey);
			
		List Mobile=(List) student.get(studentkey);	
		
		for(Object obj5 : Mobile) {
			Long mobilekey=(Long) obj5;
			System.out.println("\t\t\t\t" +mobilekey);
		}
			
		}
		}
		}
		}
		
		
	}

}
