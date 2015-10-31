package lambda;

import printing.Printer;

public class Adder {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		Printer printer = (Object o) -> {System.out.printf("The result of %d and %d is %d\n",num1,num2,o);};
		
		add(num1,num2,printer);
	}

	public static void add(int num1, int num2, Printer printer) {

		int result = num1+num2;
		printer.print(result);
	}

}
