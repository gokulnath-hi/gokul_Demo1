package day3;

import java.util.Scanner;

public class Largest {
	Scanner scan=new Scanner(System.in);
    int m=scan.nextInt();
    int n[]=new int[m];
	int large()
    {
    	
        System.out.println("The numbers are");
    	for (int i=0;i<m;i++)
    	{
    		n[i]=scan.nextInt();
    	}
    	int q=n[0];
    	for(int j=1;j<m;j++)
    	{
    		if(n[j]>q)
    			q=n[j];
    	}
    	System.out.println("The largest number is");
    	return q;
    }
	public static void main(String[] args) {
		System.out.println("No of inputs");
		Largest k=new Largest();
	    System.out.println(k.large());
	    
	   
	}

}
