package abstraction;

interface inter2{
	void m5();
	void m6();
}
interface inter3{
	void m7();
	
}

public class Class2 implements inter2, inter3{
	public void m5() {
		System.out.println("i am m5");
	}
			
	public void m6()
	{
		System.out.println("i am m6");
	}

     public void m7()
{
	System.out.println("i am m7");
}

     public static void main(String[] args) {
    	 
    	 
    	 inter2 c = new Class2();
    	 
    	 c.m5();
    	 c.m6();
    	 
    	 inter3 cc = new Class2 ();
    	 cc.m7();
    	 
     }
     
}
     
     
     
     
     
     
     