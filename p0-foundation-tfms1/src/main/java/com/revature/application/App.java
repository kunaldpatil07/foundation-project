package com.revature.application;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class App {
	public static void main(String[] args) {

// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		usingResourceBundle();
	}

	private static void usingResourceBundle() {
// TODO Auto-generated method stub
		ResourceBundle resourceBundle = ResourceBundle.getBundle("pp");
		String dburl = resourceBundle.getString("dburl");
		String driver = resourceBundle.getString("driver");
		String username = resourceBundle.getString("username");
		String password = resourceBundle.getString("password");

		System.out.println("dburl " + dburl);
		System.out.println("driver " + driver);
		System.out.println("username " + username);
		System.out.println("password " + password);
	}

	private static void usingPropertiesClassStatic() {
		Properties prop = new Properties();
		try (InputStream inputstream = App.class.getClassLoader().getResourceAsStream("tfms.properties");) {
			prop.load(inputstream);

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("dburl " + prop.getProperty("dburl"));
		System.out.println("driver " + prop.getProperty("driver"));
		System.out.println("username " + prop.getProperty("username"));
		System.out.println("password " + prop.getProperty("password"));
	}

	private static void usingPropertiesClassNonStatic() {
		Properties prop = new Properties();
		try (InputStream inputstream = App.class.getClassLoader().getResourceAsStream("tfms.properties");)
		{
			prop.load(inputstream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("dburl " + prop.getProperty("dburl"));
		System.out.println("driver " + prop.getProperty("driver"));
		System.out.println("username " + prop.getProperty("username"));
		System.out.println("password " + prop.getProperty("password"));
	}

}