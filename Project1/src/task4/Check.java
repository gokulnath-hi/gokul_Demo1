package task4;

public class Check {

	public static void main(String[] args) {
		Check c=new Check();
		int flag=0;
		int[] in= {1,2,3,3,4,5,8};
		for(int i=0;i<in.length-1;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				if(in[i]<in[j])
				{
					flag++;
				}
					
			}
			if(flag==2)
			{
				System.out.println("true");
				break;
			}
			
			}
		if(flag<2)
			System.out.println("false");


	}

}
