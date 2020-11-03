package day11;
interface Great 
{
	void great(int a,int b);
}
public class LambdaGreatest {

	public static void main(String[] args) {
		Great g=(int a,int b)->
		{
			if(a>b)
				System.out.println("a is greatest");
			else
				System.out.println("b is greatest");
				
		};
		
		g.great(20, 40);

	}

}
