package Exception;

public class FinalDemo {

public static void main(String[] args) {
	// Finally clause demo

	int a = 17, b = 0;

	try {

	} catch (ArithmeticException Ex) {
		System.out.println("Exception happened : " + Ex.getMessage());
	} catch (NullPointerException e) {
		System.out.println("Exception happened : " + e.getMessage());
	} catch (Exception e) {
		System.out.println("Exception happened : " + e.getMessage());
	}
	finally {
		System.out.println("In finally block");
	}

	///
	System.out.println("End of Program");

}

}