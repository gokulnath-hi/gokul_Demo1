package day9;

import java.util.*;

public class TestEmp {

	public static void main(String[] args) {
		Employe e1=new Employe(24,"gokul");
		Employe e2=new Employe(24,"gokul");
		Employe e3=new Employe(25,"deepak");
		
		HashSet<Employe> hs=new HashSet<Employe>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		System.out.println(hs.size());
	}

}
