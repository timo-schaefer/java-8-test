package datetime;

import java.time.Year;

public class YearMonth {

	public static void main(String[] args) {

		Year y = Year.now();
		System.out.println(y);
		System.out.println(y.isLeap());
		System.out.println(y.isBefore(Year.of(2013)));
		System.out.println(y.isAfter(Year.parse("2013")));
		
	}

}
