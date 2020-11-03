package task4;
//task4
import java.util.Scanner;

public class StringObject {
   
	void append(String a)
	{System.out.println("String to be appended");
		Scanner sc=new Scanner(System.in); 
	   String m=sc.nextLine();
        a=a+m;
        System.out.println("After appending\t"+a);
	}
	void hash(String b)
	{    char a[]=b.toCharArray();
		for(int i=0;i<b.length();i++)
		{
          if((i+1)%2!=0)
          {
        	 a[i]='#';
          }
		}
		String s2=new String(a);
		System.out.println("After replacing odd positions\t"+s2);
	}
	
	void duplicate(String c)
	{
		 char a[]=c.toCharArray();
		 for(int i=0;i<c.length();i++)
		 {
			 for(int j=i+1;j<c.length()-1;j++)
			 {
			 if(a[i]==a[j])
			 {
				 //System.out.println(a[j]);
				 a[j]='^';
				 
			 }
		 }
	}
		 String s2=new String(a);
			System.out.println("After removing duplicates\t"+s2);
		 
	}
	void convert(String d)
	{    char a[]=d.toCharArray();
		for(int i=0;i<d.length();i++)
		{
          if((i+1)%2!=0)
          {
        	 a[i]=(char)(a[i]-32);
          }
		}
		String s2=new String(a);
		System.out.println("After replacing to upper case\t"+s2);
	}

	public static void main(String[] args) {
		StringObject s=new StringObject();
		int r=1;String s1;
		System.out.println("Enter the string input");
		Scanner sk=new Scanner(System.in); 
		s1=sk.nextLine();
		switch(r)
		{
		case 1: s.append(s1);
		case 2:s.hash(s1);
		case 3:s.duplicate(s1);
		case 4:s.convert(s1);
		}
		

	}

}
