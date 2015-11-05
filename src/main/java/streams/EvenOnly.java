package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class EvenOnly {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(5,4,88,76,55,23,7,20,45);
		l.stream().filter(p -> p%2 == 1).forEach(i -> System.out.print(i+" "));
		
		Stream<Integer> s = l.stream().filter(p -> {
			System.out.println("Filter called on " + p);
			return p%2 == 1;
		});
		System.out.println("The pipeline is created - calling terminal operation");
		s.forEach(i -> System.out.println(">>>" + i));
		
		s = l.stream().filter(p -> p%2 == 1);
		Optional<Integer> result = s.findFirst();
		System.out.println(result.get());
		
		double result2 = l.stream().filter(p->p%2==1).mapToInt(p->p*p).sum();
		System.out.println(result2);
		
		OptionalInt result3 = l.stream().filter(p->p%2==1).mapToInt(p->p*p).reduce((a,b)->a+b);
		System.out.println(result3.getAsInt());
		
		OptionalInt result4 = l.stream().filter(p->p%2==1).mapToInt(p->p*p).reduce(Integer::sum);
		System.out.println(result4.getAsInt());
		
		int result5 = l.stream().filter(p->p%2==1).mapToInt(p->p*p).reduce(100,(a,b)->a+b);
		System.out.println(result5);
	}

}