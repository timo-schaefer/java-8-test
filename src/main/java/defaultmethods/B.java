package defaultmethods;

public class B implements A, A2 {

	
	@Override
	public void doSomething() {
		// use implementatio of interface A2
		A2.super.doSomething();
	}
	
}
