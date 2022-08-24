package encapsulatuon;

public class student {
	
	private int rollno;  // data hiding
	public void setrollno (int rollno) {
		
		this.rollno=rollno;
	}
	
	
	public int getrollno() {
		
		return rollno;
	}

	public static void main(String[] args) {
		
             student s=new student();
         s.setrollno(101);
         System.out.println(s.getrollno());
         s.setrollno(202);
         System.out.println(s.getrollno());

		
		
	}

}
