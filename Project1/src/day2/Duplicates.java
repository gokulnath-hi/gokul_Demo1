package day2;

import java.util.Scanner;

public class Duplicates {
	static int n;
	 char accept()
	  {
	   Scanner sc = new Scanner(System.in);
	   char a= (char)(Integer.parseInt(sc.nextLine())+65);
	   return a;
	  }
	 void removeDuplicate()
	 {
		 for(int i=0;i<n;i++)
		 { 
				 
		 }
	 }
	 
	public static void main(String[] args) {
		System.out.println("No of inputs");
		Scanner e=new Scanner(System.in);
		 n=e.nextInt();
		System.out.println("The numbers are");
		Duplicates []d=new Duplicates[n];
	       for(int i = 0; i < n; i++)
            d[i] = new Duplicates();
	       //System.out.println("The characters are");
	       for(int i=0;i<n;i++)
	            System.out.println(d[i].accept());
	       
	}

}
