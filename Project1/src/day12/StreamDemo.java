package day12;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list=Arrays.asList(45,8,42,21,6,34,6,7,12,2,12,45);
		
		List<Integer> list1=list.stream().filter(i->i >10).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Integer> list2=list.stream().filter(i->i >10).distinct().collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3=list.stream().filter(i->i >10).limit(4).collect(Collectors.toList());
		System.out.println(list3);

		
	}

}
