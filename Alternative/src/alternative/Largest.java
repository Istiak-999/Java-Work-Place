
package alternative;
import java.util.Scanner;
public class Largest {
    void largest(){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=input.nextInt();
        System.out.println("Enter 2nd number : ");
        int b=input.nextInt();
        if(a>b){
            System.out.println(a+" is the largest number");
        }
        else if (b>a){
            System.out.println(b+" is the largest number");
        }
        else
            System.out.println("The number are equel");
    }
}
