package day5;

public class ToString {
	int a=5;
	String name="hello";

	public static void main(String[] args) {
		ToString obj=new ToString();
		System.out.println(obj);
	}
	public String toString()
	{
		return a+" "+name;
	}

}
