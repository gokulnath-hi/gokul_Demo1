package day11;
import java.lang.*;
import java.util.*;
interface Function
{
	void apply(double x,double y);
}
public class LambdaPower {

	public static void main(String[] args) {
		Function obj = (double x,double y) ->
		 {
			System.out.println(Math.pow(x, y));
			 
		 };
		 
		 obj.apply(3,4);

	}

}
