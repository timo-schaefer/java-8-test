package strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoin {

	public static void main(String[] args) {

		String s1 = String.join(",", "Hello", "World", "Again");
		System.out.println(s1);
		
		List<String> l = Arrays.asList("Hello", "World", "Again");
		String s2 = String.join(",", l);
		System.out.println(s2);

		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.add("Test1").add("Test2").add("Test3");
		String s3 = sj.toString();
		System.out.println(s3);
	}

}
