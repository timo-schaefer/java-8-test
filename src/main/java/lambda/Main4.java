package lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {

		Detector d = new Detector();
		
		List<Integer> l = new LinkedList<>(Arrays.asList(4, 5, 88, 76, 55, 23, 7, 20, 45));

		l.removeIf(d::isEven);
		System.out.println(l);
	}

}
