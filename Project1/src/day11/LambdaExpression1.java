package day11;

interface Basic1
{
	void add(int a);
}
interface Basic2
{
	void sum(int a,int b);
}
interface Basic3
{
	void print();
}
interface Basic4
{
	void print();
}
public class LambdaExpression1 {

	public static void main(String[] args) {
		Basic1 obj1=(int a) ->
		System.out.println("added number is "+(a+10));
		obj1.add(20);
		
		Basic2 obj2=(int a,int b) ->
		System.out.println("Sum is "+(a+b));
		
		obj2.sum(10, 20);
		 
		String str="Hello";
		Basic3 obj3=() ->
		System.out.println("String Length is "+str.length());
		
		obj3.print();
		
		Basic4 obj4=() ->
		System.out.println("Hello World");
		
		obj4.print();
	}

}
