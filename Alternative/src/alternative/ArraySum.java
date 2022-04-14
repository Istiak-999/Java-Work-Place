
package alternative;

import java.util.Scanner;


public class ArraySum {
   private int i;
    int sum=0;
    int n;
    void sum(){
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Array size=");
        n=input.nextInt();
        
        System.out.println("Enter "+n+" numbers=");
  int[]arr=new int[10];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
      
        for(i=0;i<5;i++){
            
             sum=sum+arr[i];
            
            
        }
        System.out.println("Sum = "+sum);
    }
    
}
