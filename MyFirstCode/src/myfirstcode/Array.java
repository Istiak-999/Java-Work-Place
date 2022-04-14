package myfirstcode;

import java.util.Scanner;


 class Array {

	public void array()
	{

		int []number=new int[5];

		Scanner input =new Scanner(System.in);

		int i,sum=0;

		System.out.println("Enter 5 numbers");
		
		for(i=0; i<5; i++)
		{
			number[i]=input.nextInt();
		}
		input.close();
		for ( i = 0; i < 5; i++) {
			sum=sum+number[i];
		}
		
		System.out.println(sum);
		
		
	}

}