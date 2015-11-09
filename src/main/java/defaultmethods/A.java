package defaultmethods;

public interface A {

	public default void doSomething() {
		System.out.println("I am A");
	}
	
	public static void staticMethod() {
		System.out.println("I am a static method");
	}
	
}
