package test;

public class Demo {
	
	
    int a=10 ;// ---non static
    static int b=20; // static 
    
    public void display () {// -- non static
    System.out.println("i am play display method");

    }
		
			public static void show () {
				System.out.println("i am show display method");
			}
         

	
		
	

	public static void main(String[] args) {
		System.out.println(Demo.b);
		
		Demo d=new Demo();///
	
		System.out.println(d.a);
		
		d.display();///
		d.show();///
		
		

		

		

		
		

	}

}
