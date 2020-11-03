package day12;
import java.time.*;
import java.time.format.*;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		System.out.println(date.getMonth());
		System.out.printf("%d-%d-%d\n",dd,mm,yy);
		DateTimeFormatter np=DateTimeFormatter.ofPattern("dd-MM-yy");
		String Date1=date.format(np);
		System.out.println(Date1);
		
		

	}

}
