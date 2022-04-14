
package asgard;

import java.util.Scanner;

public class ReservationSystem {
	
    int fticket=10,eticket=10;
    
    public void choose(){
        
        
          System.out.println("Please choose 1 for firstclass or choose 2 for economy\n");
        
        Scanner input = new Scanner(System.in);
        
        int opt = input.nextInt();
        
        if(opt==1)
        {
          available(); 
        }
        else if(opt==2)
        {
            available();
        }
        else
            System.out.println("Please input right number");
          
        
        
    } 
    public void available(){
        
        if(fticket>0 || eticket>0){
            System.out.println("first class ticket is available");   
        }
        else
            System.out.println("Ticket is not available");  
        
    }
    
    
}
