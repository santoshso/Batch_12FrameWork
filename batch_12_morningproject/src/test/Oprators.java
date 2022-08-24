package test;

public class Oprators {

	public static void main(String[] args) {
		
		
		
		int a=20;
		int b=10;
		
		// Arithmetic operators--------> +,-,*,/,%
		System.out.println("Arithmetic operator");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		//relational operator -----------= ,>,<,==,>=,<=,!>
		System.out.println("relational operator");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		// Logical AND operator
		
		System.out.println("Logical AND operator");
		System.out.println(a>b&&a>=b);
		System.out.println(a<b&& a>b);
		System.out.println(a>b&& a>b);
		System.out.println(a<=b&&a<b);
		
		
		// Logical OR operator
		System.out.println("Logical OR operator");
		System.out.println(a>b||a>=b);
		System.out.println(a<b||a>b);
		System.out.println(a>b||a<b);
		System.out.println(a<=b||a<b);
		
		// NOT operator
		
		System.out.println("NOT opeartor");
		System.out.println(!(a>b));
		System.out.println(!(a<b));
		
		

	}

}
