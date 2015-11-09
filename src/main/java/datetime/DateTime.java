package datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getMonth());
		System.out.println(dt.getDayOfWeek());
		dt = dt.plusDays(2);
		System.out.println(dt.getDayOfWeek());
		dt = dt.plusHours(5).plusMinutes(10);
		System.out.println(dt);
		System.out.println(dt.atOffset(ZoneOffset.ofHours(-11)));
		dt = dt.minusWeeks(20);
		System.out.println(dt);
		dt = dt.withDayOfMonth(4).withYear(2009);
		System.out.println(dt);
		
		dt = LocalDateTime.of(2014,Month.MARCH,3,12,24,33);
		System.out.println(dt);
		dt = LocalDateTime.parse("2014-03-20T20:12:33", DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(dt);
		
	}

}
