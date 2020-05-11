package demo;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		try {
			demo();
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	public static void demo() throws Exception {
			System.out.println("Hello World...!");
			throw new ArithmeticException("Not valid operation");
			//int i = 1/0;
			//System.out.println("completed");
	}
}