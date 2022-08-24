package javaconstructor;

public class a3 {
	
	String name;  //     santosh sham
	int marks;   // 90   85
	
	
	a3(String name,int marks){
	
		this.name=name;
		this.marks=marks;
		
		System.out.println(this.name+":"+ this.marks);
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		a3 a=new a3("santosh", 90);
		
		a3 a1 =new a3("sham",85);
		
	

	}

}
