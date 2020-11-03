package day9;

import java.text.*;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();
		Date d=new Date();
	     int year = c.get(Calendar.YEAR);
		 int month = c.get(Calendar.MONTH);     
		 int day = c.get(Calendar.DAY_OF_MONTH);
		 System.out.printf("%4d %4d %4d\n",month,day,year);
	
		
		SimpleDateFormat s1=new SimpleDateFormat("hh:mm:ss a");
	        System.out.println(s1.format(d));

	}

}
