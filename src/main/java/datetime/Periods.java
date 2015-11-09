package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Periods {

	public static void main(String[] args) {

		LocalDate ld1 = LocalDate.of(2014, Month.JANUARY, 22);
		LocalDate ld2 = LocalDate.of(2014, Month.MARCH, 12);
		Period p = Period.between(ld1, ld2);
		System.out.printf("%d years, %d months, %d days\n", p.getYears(), p.getMonths(), p.getDays());
		
		Period p2 = Period.ofDays(2000);
		System.out.printf("%d years, %d months, %d days\n", p2.getYears(), p2.getMonths(), p2.getDays());
	}

}
