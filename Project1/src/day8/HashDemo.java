package day8;
import java.util.*;
public class HashDemo {

	public static void main(String[] args) {
     HashSet<String> s1=new HashSet<String>();
     s1.add("Beginner");
     s1.add("Java");
     s1.add("Java");
     s1.add("Tutorial");
     System.out.println("Element as a set"+s1);
     System.out.println("s1.contains java :"+s1.contains("Java"));
     
     TreeSet<String> t1=new TreeSet<String>(s1);
     System.out.println("t1.equal s1 :"+t1.equals(s1));
     
     Iterator<String> itr=t1.iterator();
     System.out.println("Iteration type 1");
     while(itr.hasNext())
     {
    	 String e=itr.next();
    	 System.out.println(e);
     }
     System.out.println("Iteration type 2");
     for(String o:t1 )
    	 System.out.println(o);
     
	}

}
