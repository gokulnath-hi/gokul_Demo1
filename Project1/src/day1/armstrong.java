package day1;

import java.util.*;
import java.lang.*;

public class armstrong {
	static int n;
	public static void main(String[] args) {	
		int t;int c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		t=n;c=0;
		while(t>0)
		{
			t=t/10;
			c++;
		}
		
		t=n;double sum=0;int q;double p;
		while(t>0)
		{   q=t%10;
		  p=Math.pow(q,c);
			sum=sum+p;
			t=t/10;
		}
    System.out.println(sum);
    int a=(int)sum;
    System.out.println(a);
		if(a==n)
		{
			System.out.println("it is an armstrong number");
		}
		else
			System.out.println("it is not an armstrong number");
			
		

	}


	}


