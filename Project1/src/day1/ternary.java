package day1;

import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=(a>b&a>c)?a:((b>a&b>c)?b:c);
		System.out.printf("The greatest number is\n");
		System.out.println(d);
		

	}

}
