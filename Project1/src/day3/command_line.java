package day3;

import java.util.Scanner;

public class command_line {
	int eno;String ename;
	void accept(int eno,String ename)
	{ 
		
		this.eno=eno;
		this.ename=ename;
			
	}
	void display()
	{
		System.out.println("Employee no is\t"+eno);
		System.out.println("Employee name is\t"+ename);	
		}

	public static void main(String[] args) {
		command_line e1=new command_line();
		e1.accept(Integer.parseInt(args[0]),args[1]);
		e1.display();
	}

}
