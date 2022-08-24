package a97ExceptionHandling;

public class a1 {

	public static void main(String[] args) {
	
		try {
		int a=10;
		int b=5;
		int c;
		
		c=a/b;
		
		System.out.println(c);   //Arithmetic Exception 

	}
    catch (ArithmeticException  e) {
    	
    	System.out.println(e);
    	
    }
     finally {
    	 System.out.println("i am finally block");
     }
		
		
		System.out.println("santosh");
}
}

