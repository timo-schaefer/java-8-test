package lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		List<Integer> l = new LinkedList<>(Arrays.asList(4, 5, 88, 76, 55, 23, 7, 20, 45));

		System.out.println(l);
		l.removeIf(i -> i % 2 == 0);
		System.out.println(l);
	}

}
