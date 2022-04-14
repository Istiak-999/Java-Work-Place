package myfirstcode;

import java.util.Scanner;

public class even {
	
	int n;
	void even1(){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enetr your number = ");
		
		 n=input.nextInt();
		 
		 if(n%2==0) {
			 
			 
			 System.out.println(n+"is a even number");
		 }
		
		 else if(n%2!=0) {
			 System.out.println(n+"is an odd number");
			 
		 }
		 
		 else
			 System.out.println("The number is 0");
		 
		    input.close();
		    int b=1,s=5;
		    int x= (b>s)? b:s;
		    System.out.println(x);
		    
		
	}
	

}

