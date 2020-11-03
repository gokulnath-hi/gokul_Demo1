package day11;

interface Split
{
	void apply();
}
public class LambdaString {

	public static void main(String[] args) {
		
		Split s=()->
		{  
			String str=new String("HCL");
			char a[]=str.toCharArray();
			for(int i=0;i<str.length();i++)
			{
			
			System.out.print(a[i]+"\t");
			
			}
					
		};
		
     s.apply();
	}

}
