package task4;
//task4
import java.util.*;

class UpperCase {
	void upper(String d)
	{
		char a[]=d.toCharArray();
		int i=0;
		a[i]=(char)(a[i]-32);
		do
		{
			if(a[i]==' ')
			{
				 a[i+1]=(char)(a[i+1]-32);
			}
			i=i+1;
		}while(i<d.length());
		String s2=new String(a);
		System.out.println("After changes\t"+s2);
	}

	public static void main(String[] args) {
		UpperCase s=new UpperCase();
		String s1;
		System.out.println("Enter the string input");
		Scanner sk=new Scanner(System.in); 
		s1=sk.nextLine();
		s.upper(s1);
	}

}
