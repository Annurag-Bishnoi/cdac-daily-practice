package demo;
import java.util.*;
public class ClassAssignmentday3 {
	
	
	public static int addition(int first,int second) {
		int sum= first+second;
		return sum;
	}
	
	public static int subtraction(int first,int second) {
		int sub= first-second;
		return sub;
	}
	
	public static int multiplication(int first,int second) {
		int multi= first*second;
		return multi;
	}
	
	public static int division(int first,int second) {
		int div= first/second;
		return div;
	}
	
	public static void reverseTheArray(int[] arr) {

		for(int i=0;i<arr.length/2;i++) {
			
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("Reveresed Array : "+Arrays.toString(arr));
		
		return;
	}
	
	
	
	public static void updatearray(int[] arr2, int index, int newvalue) {
	
		
		arr2[index]=newvalue;
		System.out.println("Here is Your Updated Array : "+Arrays.toString(arr2));
		return ;
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***********Select The Question You Wants to Try********************");
		
		System.out.println("1. Switch Case – Menu Driven Calculator");
		System.out.println("2. Reverse The Array");
		System.out.println("3. Update An Element In A Array");
		System.out.println("4. Call By Value : Primitive Type");
		System.out.println("5. Array Reference : Method Parameter");
		
		System.out.println("Enter Your Option");
		int x=sc.nextInt();
		
		
		switch(x) {
		
		
		
		   case 1:	
		         	System.out.println("Enter First Number : ");
		         	int first=sc.nextInt();
		         		System.out.println("Enter Second Number : ");
		         		int second=sc.nextInt();
		
		        
		         		System.out.println("**************Select Arthmetic Operation!!!!*************************");
		         		System.out.println("1. Addition");
		         		System.out.println("2. Subtraction");
		         		System.out.println("3. Multiplication");
		         		System.out.println("4. Division");
		         		System.out.println("5. Exit");
		         		
		
		         		System.out.println("******************************************Enter Your Option************************************");
		         		int x2 =sc.nextInt();
		         switch(x2) {
		         	   case 1: 
			             System.out.println(addition(first,second));
			              break;
		               case 2:
			             System.out.println(subtraction(first,second));
			             break;
		               case 3:
		            	   System.out.println(multiplication(first,second));
		            	   break;
		               case 4:
		            	   System.out.println(division(first,second));
		            	   break;
		               case 5:
		            	  
		            	   break;
		               default:
		         
		        }
		
		
		break;
		
		
		
		   case 2:
			   
			   System.out.println("Enter the Size of Array:");
			    int size = sc.nextInt();
			    System.out.println("Please Enter Your Array:");
			    int[] arr = new int[size]; 
			    
			    for(int i=0; i<arr.length; i++) {
			    	 arr[i] = sc.nextInt();	       
			    }

			    		 System.out.println("Original Array : "+Arrays.toString(arr));
			    		 
			    		reverseTheArray(arr);
			   
			   break;
			   
			  
		   case 3:
			   System.out.println("Enter the Size of Array:");
			    int size2 = sc.nextInt();
			    System.out.println("Please Enter Your Array:");
			    int[] arr2 = new int[size2]; 
			    
			    for(int i=0; i<arr2.length; i++) {
			    	 arr2[i] = sc.nextInt();	       
			    }

			    		 System.out.println("Original Array : "+Arrays.toString(arr2));
			    		 
			    		System.out.println("Enter The Index Of Array To Update That(Hint:  Index = Actual Postion -1)  : ");
			    		 int index=sc.nextInt();
			    		 
			    		 System.out.println("Enter the New Value At "+index+" Index : ");
			    			int newvalue=sc.nextInt();
			    		 updatearray(arr2,index,newvalue);
			    		 
			   break;
		   case 4:System.out.println("Work In Progress!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		   case 5:
			  
			   
			   default:
				   
		
	
	
		}
}

	

	
	}
