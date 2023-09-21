package Exception;

public class ThrowDemo {

		public static void main(String[] args) {

			int a = 45, b = 0, rs;
				
				if(b==0)        
	                 throw(new ArithmeticException("Can't divide by zero.")); 
				
				System.out.println("END of Program");
		}
	}