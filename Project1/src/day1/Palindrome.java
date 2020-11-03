package day1;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		String s1;int len;String s3="";
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		s1=s.next();
	    len=s1.length();
	    String s2=s1;
		for(int i=len-1;i>=0;i--)	
		{
		   	s3=s3+s1.charAt(i);
		   	
		}
		if(s2.equals(s3))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
}

}


