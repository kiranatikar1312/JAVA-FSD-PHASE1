package Exception;

class MyException extends Exception 
{ 
	private static final long serialVersionUID = 1L;

	public MyException(String s) 
    { 
        super(s); 
    } 
		}


public class CustomException {
	
	public static void main(String[] args) {
		// CustomeException Demo
		System.out.println("Custom Exception Demo ");
		
		CustomException custom1 = new CustomException();
		
		
		try {
			custom1.method1(15);
			
			custom1.method1(5);
			
		} catch (MyException e) {
			
			System.out.println("Exception happened : "+e.getMessage());
		}
		
	}
	
	public void method1(int x) throws MyException{
		if(x==5)
			throw new MyException("Input 5 is not allowed.");
		else		
		System.out.println("Thank you for input "+ x);
		
	}
}

