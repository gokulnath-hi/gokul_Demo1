package day6;

public class Inter implements I{
 public void meth1()
 {
	 System.out.println("in meth1");
 }
 public void meth2()
 {
	 System.out.println("in overridden meth2");
 }
	public static void main(String[] args) {
		Inter obj=new Inter();
		obj.meth1();
		obj.meth2();
		I.meth3();

	}
		
	}
