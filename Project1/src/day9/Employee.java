package day9;
import java.util.*;
public class Employee {
   int EmpID;String EmpName;

	public int getEmpID() {
	return EmpID;
}
public void setEmpID(int empID) {
	EmpID = empID;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpNamel(String empName) {
	EmpName = empName;
}
   Employee(int EmpID,String EmpName)
   {
	   this.EmpID=EmpID;
	   this.EmpName=EmpName;
   }
   public String toString()
   {
	   return EmpID+""+EmpName;
   }
	public static void main(String[] args) {
	  HashSet<Employee> s1=new HashSet<Employee>();
	  Employee e1=new Employee(101,"gokul");
	  Employee e2=new Employee(102,"deepak");
	  Employee e3=new Employee(103,"yadav");
	  
	  s1.add(e1);
	  s1.add(e2);
	  s1.add(e3);
	  Iterator<Employee> itr=s1.iterator();
	     System.out.println("Iteration type 1");
	     while(itr.hasNext())
	     {
	    	 Employee e=itr.next();
	    	 System.out.println(e);
	     }
	     System.out.println("Iteration type 2");
	     for(Employee o:s1 )
	    	 System.out.println(o);

	}

}
