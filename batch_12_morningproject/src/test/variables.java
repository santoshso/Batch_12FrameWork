package test;

public class variables {

	int b=40;// instance variable----declare inside the class but outside the method 
	
	static int c=50; // static variable ---declare inside the class but outside methods ---use keyword static/class variables
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		

	
		int a=30;// local variable ---declare inside the method
		
		variables test= new variables();// object creation --call non static
		
		
		System.out.println(a);// 30
		
		System.out.println(test.b);// 40 
		
		int c=50;//50  ---static 
		System.out.println(c);
	
		
		

	}

}
