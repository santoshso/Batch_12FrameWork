package javaconstructor;

public class a4 {

	String name;// sagar__santosh___sandeep___sham___tukaram___ram____raj___vicky___amol___anil
	
	int mathmark;
	int marathimarks;
	int englishmarks;
	
	
	
	
	a4(String name , int mathmarks, int marathimarks, int englishmarks){
		
		
		this.name=name;
		this.mathmark=mathmarks;
		this.marathimarks=marathimarks;
		this.englishmarks=englishmarks;
		
		
		
		
		System.out.println(this.name+":      "+this.mathmark+" :        "+this.marathimarks+":        "+ this.englishmarks);
		
		
	}  
	
	
	public static void main(String[] args) {
		
		System.out.println("name  | "+ "mathmark  |  "+ "marathimarks  | "+" englishmarks"  );
		System.out.println("---------------------------------------------------------------");
		
		
		
		a4 a=new a4("sagar",               90,                   87,                90);
		a4 a1= new a4("santosh",           87,                   88,                72);
		a4 a2= new a4("sandeep",           88,                   92,                89);
		a4 a3= new a4("sham",              99,                   97,                88);
		a4 a5= new a4 ("tukaram",          88,                   87,                89);
		a4 a6= new a4 ("ram" ,             90,                   94,                94);
		a4 a7 = new a4 ("raj",             91,                   97,                97);
		a4 a8= new a4 ("vicky" ,           87,                   78,                66);
		a4 a9= new a4 ("amol",             76,                   88,                45);
		a4 a10 =new a4 ("anil",            98,                   67,                88);
		
		
	  
		
		
		
		
		
		
		
		

	}

}
