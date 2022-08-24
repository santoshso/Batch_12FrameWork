package a97ExceptionHandling;

public class a2 {

	public static void main(String[] args) {
	try {
		int a=20;
		int b=5;
		int c;
		
		c=a/b;
		System.out.println(c);
		
	}
	catch (ArithmeticException  e) {
		System.out.println(e);
	}
		
	finally {
		System.out.println("shaurya is brillent guy");
	}
		

	}

}
