package day12;

import java.util.*;
import java.util.stream.Collectors;

public class ApiArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list=Arrays.asList("Mango","Orange","Apple","Pineapple","Grapes");
       
		List<Integer> list1=list.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println(list1);
		
		
	}

}
