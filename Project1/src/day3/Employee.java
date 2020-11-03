package day3;

public class Employee {
	int empNo;String empName;
	Employee()
	  {
		  empNo=100;
		 empName="Gokul";
	  }
	
  Employee accept(int a,String b)
  { 
	  Employee e=new Employee(); 
	   e.empNo=a;
	  e.empName=b;
	  return e;
  }
  void display()
  {
	     System.out.println("Employee number is "+empNo+" and Employee name is "+(String)empName);
  }
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=e1.accept(102,"Deepak");
		e1.display();
		e2.display();
	}

}
