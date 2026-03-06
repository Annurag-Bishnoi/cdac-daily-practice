package demo;

public class Exam extends Student2 {
	
	int pmarks;
	int mmarks;
	int cmarks;
	public Exam(String name,int rollno, int pmarks, int mmarks, int cmarks) {
		super(name,rollno);
		this.pmarks = pmarks;
		this.mmarks =mmarks;
		this.cmarks = cmarks;
	}
	
	
	void displayMarks() {
		System.out.println("Physics Marks : "+pmarks);
		System.out.println("Chemistry Marks : "+cmarks);
		System.out.println("Mathmatics Marks : "+mmarks);
	}

}
