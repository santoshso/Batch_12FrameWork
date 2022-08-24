package inheritance;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		
		System.out.println("enter any no");
		Scanner a= new Scanner(System.in);
        int no=a.nextInt();
        int z=no;
        int rev=0;
        while(no!=0) {
        	
        	int rem=no%10;
        	rev=rev*10+rem;
        	no=no/10;
        }
        
        if(z==rev) {
        	System.out.println("palindrome_no");
        		
        	
        }
        else
        {
        	System.out.println("not a polindrome_no");
        }
        	
        	
        	
	}

}
