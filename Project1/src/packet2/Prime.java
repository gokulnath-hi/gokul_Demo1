package packet2;

public class Prime {
	public void prime(int i)
	{  int count=0;
		for(int j=1;j<=i;j++)
	{
		if(i%j==0)
		{
			count++;
		}
	}
		if(count==2)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
}
}
