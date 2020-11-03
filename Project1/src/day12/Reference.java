package day12;
import java.util.*;
import java.util.Arrays;

public class Reference {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		
		l=Arrays.asList(3,4,5,6);
		
		//for(int o:l)
			//System.out.println(o);
		
		l.forEach(i->{
			
			System.out.println(i);
		
		});
		
		l.forEach(System.out::println);

	}

}
