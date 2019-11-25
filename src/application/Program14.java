package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program14 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Calendar cal = Calendar.getInstance();
		
		Date d1 = sdf1.parse("06/08/1979");
		Date d2 = sdf2.parse("06/08/1979 15:30:00");
		Date d3 = new Date();
		Date d4 = new Date(System.currentTimeMillis());
		Date d5 = new Date(1000L * 60L * 60L * 5L);
		Date d6 = new Date(0L);
		Date d7 = Date.from(Instant.parse("1979-08-06T15:30:00Z"));
		
		LocalDateTime now = LocalDateTime.now();
		
		cal.setTime(d2);
		cal.add(Calendar.DAY_OF_MONTH, 10);
		d2 = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH);
		
		System.out.println(sdf2.format(d1));
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(now);
		System.out.println("minutes: " + minutes);
		System.out.println("month: " + (month + 1));
	}
}