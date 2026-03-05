package demo;

public class Result extends Exam {
	Result(String name,int rollno, int pmarks, int mmarks, int cmarks){
		super(name, rollno,pmarks,mmarks,cmarks);
	}
		
		void calculateTotal() {
			
		int totalmarks=pmarks+cmarks+mmarks;
		System.out.println("Total Marks : "+totalmarks);
	}
	
	
}
