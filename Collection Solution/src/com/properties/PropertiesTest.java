package com.properties;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {

		Properties p=new Properties();
		p.setProperty("abc", "123");
		p.put(1,2);
		
		System.out.println(p);
		System.out.println(p.getProperty("abc"));
	}

}
