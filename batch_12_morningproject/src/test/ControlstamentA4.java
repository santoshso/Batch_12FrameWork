package test;

public class ControlstamentA4 {
	
	// nested---if 

	public static void main(String[] args) {
		
		int a= 40;
		int b= 20;
		int c =30;
		
		
		if (a<b) {
			System.out.println("a is less than b");
			
			if (a<c) {
				System.out.println("a is less tahn c");
			}
			else {
				System.out.println("a is greater than c");
				
			}
		}else {
			System.out.println();
		}


		

	}

}
