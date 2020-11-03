package day5;
import java.util.Scanner;

import packet1.*;
import packet2.*;
public class Simple_Tester extends Prime implements Prime_tester{
	   
	public static void main(String[] args) {
	    Simple_Tester p=new Simple_Tester();
	    System.out.println("Enter the number");
	    Scanner sc=new Scanner(System.in);
	    int k=sc.nextInt();
	    p.prime(k);
	}

}
