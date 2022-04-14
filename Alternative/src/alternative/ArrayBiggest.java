
package alternative;

import java.util.Scanner;

//import java.util.Scanner;

public class ArrayBiggest {
    private int i,big;
    void arraybig(){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Input array size");
        int n=input.nextInt();
        System.out.println("Input "+n+" elements=");
        int[]arr= new int[10];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
               
        }
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    big=arr[i];
                }
                else
                    big=arr[j];
            }
        }
        System.out.println("Biggest number of the array is: "+big);
        
    }
    
}
