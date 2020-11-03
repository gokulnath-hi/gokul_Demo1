package task4;

import java.util.*;

public class PositiveString {

	public static void main(String[] args) {
		PositiveString s=new PositiveString();
		String s1;
		System.out.println("Enter the string input");
		Scanner sk=new Scanner(System.in); 
		s1=sk.nextLine();
		char a[]=s1.toCharArray();
		int c=a.length;int flag=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				flag++;	
			}
		}

		if(flag==c)
			System.out.println("Positive String");
		else
			System.out.println("Not a Positive String");
	}

}
