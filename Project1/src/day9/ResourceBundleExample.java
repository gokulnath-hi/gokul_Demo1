package day9;

import java.util.*;

public class ResourceBundleExample {

	public static void main(String[] args) {
		String resourceName = "day9.RBExample";
		ResourceBundle rb;

		rb = ResourceBundle.getBundle(resourceName);
		System.out.println("Default :" + rb.getString("Hello.text"));

		rb = ResourceBundle.getBundle(resourceName, Locale.GERMANY);
		System.out.println("German :" + rb.getString("Hello.text"));

		rb = ResourceBundle.getBundle(resourceName, Locale.CHINA);
		System.out.println("Chinese :" + rb.getString("Hello.text"));

		Locale.setDefault(Locale.FRANCE);
		rb = ResourceBundle.getBundle(resourceName);
		System.out.println("French :" + rb.getString("Hello.text"));

		rb = ResourceBundle.getBundle(resourceName, Locale.CHINA);
		System.out.println("Chinese :" + rb.getString("Hello.text"));

	}

}
