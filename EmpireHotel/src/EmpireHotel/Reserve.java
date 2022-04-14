
package EmpireHotel;

import java.util.Scanner;

public class Reserve {
    private String name;
    private int choice;
    
    void reservation(){
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name :");
        name=input.next();
    
        System.out.println("How many room you want to booked?");
        choice=input.nextInt();
        System.out.println("Your request is processing.please wait some time.");
    }
    
}
