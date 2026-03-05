package demo;

public class DimondPattern {
	
	public static void main(String[] args) {
		int n=6;
//		Upper Part
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
		System.out.print("*");
		}
		for(int k=1;k<=2*(n-i);k++) {
			System.out.print(" ");
		}
		for(int l=0;l<=i;l++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
//	Lower Part
	for(int i=n-1;i>=0;i--) {
		//First Stars
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
	    for(int k=1; k<=2*(n-i);k++) {
	    	System.out.print(" ");
	    }
	    for(int l=0;l<=i;l++) {
	    	System.out.print("*");
	    }
		System.out.println();
	}
	
	}
	
}
