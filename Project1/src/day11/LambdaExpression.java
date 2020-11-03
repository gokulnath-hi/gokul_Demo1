package day11;

interface Transaction
{
	void withdraw(int amt);
}


public class LambdaExpression {

	public static void main(String[] args) {
		Transaction obj=(int amt) ->
		System.out.println("amount is "+amt);
	
		obj.withdraw(600);

	}

}
