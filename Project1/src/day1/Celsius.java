package day1;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		float f,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter fahrenheit\t");
		f=s.nextFloat();

		c=5*((f-32)/9);
		System.out.println("+f fahrenheit in celsius is\t"+c);	

	}
}
