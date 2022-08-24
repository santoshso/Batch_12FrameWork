package encapsulatuon;

public class student3 {
	
	private int rollno;
	
	public void setrollno(int rollno) {
		
		this.rollno=rollno;
	}

	public int getrollno() {
		
		return rollno;
	}
	public static void main(String[] args) {
		student s= new student();
		s.setrollno(444);
		System.out.println(s.getrollno());
		s.setrollno(555);
		System.out.println(s.getrollno());

	}

}
