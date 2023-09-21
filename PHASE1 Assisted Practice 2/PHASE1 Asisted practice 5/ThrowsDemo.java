package Exception;

public class ThrowsDemo {

		public static void main(String[] args) {
			// Throws Demo
			
			Class1 c1 = new Class1();
			
			try {
				
			c1.division();
			
			}catch(Exception e) {
				System.out.print("\nExceptoion happend : " + e);	
			}
		}
	}

	//
	class Class1 {

		void division() throws Exception {
			int a = 45, b = 0, rs;
			rs = a / b;
			System.out.print("\n\tThe result is : " + rs);
		}
	}