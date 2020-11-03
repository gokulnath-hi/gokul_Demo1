package day5;

import day4.*;
import packet1.*;

public class Sample extends Demo implements I2 {
		public void meth3()
		{
			System.out.println("meth3");
		}
		public void meth4()
		{
			System.out.println("meth4");
		}
	public void meth5()
	{
		System.out.println("meth5");
	}
	public void meth6()
	{
		System.out.println("meth6");
	}
	public void meth7()
	{
		System.out.println("meth7");
	}
	
	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		obj.meth5();
		obj.meth6();
		obj.meth7();
		

	}

}
