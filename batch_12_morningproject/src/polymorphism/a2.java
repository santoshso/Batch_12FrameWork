package polymorphism;

public class a2 {// over loading
	public void M1(int a,String b) {    
		System.out.println("hello1");
	}
	
	public void M1(String b, int a) {
		System.out.println("hello2");
		
	}
	

	public static void main(String[] args) {
		
		a2 a= new a2 ();
		
		a.M1(123, "abc"); 
        a.M1("abc", 123);
	}

}
