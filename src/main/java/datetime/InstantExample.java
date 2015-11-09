package datetime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {

	public static void main(String[] args) {

		Instant now = Instant.now();
		System.out.println("Epoch seconds = " + now.getEpochSecond());
		System.out.println("Offset nanoseconds = " + now.getNano());
		System.out.println(now.toString());
		
		now = now.minusSeconds(86400);
		System.out.println(now.toString());
		
		System.out.println(now.until(Instant.now(), ChronoUnit.HOURS));
	}

}
