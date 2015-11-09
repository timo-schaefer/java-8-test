package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class Durations {

	public static void main(String[] args) {

		Instant i1 = Instant.now();
		try {
			Thread.sleep(1050L);
		} catch (InterruptedException e) {
			
		}
		
		Instant i2 = Instant.now();
		Duration d = Duration.between(i1, i2);
		System.out.printf("%d seconds and %d nanoseconds elapsed\n", d.getSeconds(), d.getNano());
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		ldt = ldt.plus(d);
		System.out.println(ldt);
	}

}
