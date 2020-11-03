package day8;

import java.util.*;

public class KeyValueDemo {

	public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("1");
	a1.add("2");
	a1.add("3");	
	TreeSet<String> t1=new TreeSet<String>(a1);
	HashSet<String> s1=new HashSet<String>();
	s1.add("one");
	s1.add("two");
	s1.add("three");
	
	HashMap<HashSet,ArrayList> hm=new HashMap<HashSet,ArrayList>();
	hm.put(s1, a1);
	
	}

}
