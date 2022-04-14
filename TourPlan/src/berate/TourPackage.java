package berate;

import java.util.Scanner;


public class TourPackage {
    String package_id,package_name;
    int package_price,seat_capacity;
    void package_details(){
        
        
    System.out.println("Enter your package id=");
    Scanner sc= new Scanner(System.in);
    package_id= sc.nextLine();
    
    System.out.println("Enter your package name=");
    package_name= sc.nextLine();
    
     System.out.println("Enter package price=");
    package_price= sc.nextInt();
    
    System.out.println("Enter how many package you want=");
    seat_capacity= sc.nextInt();
   if (seat_capacity>10){
       System.out.println("No seat available");
       
   }
   else
   {
       Traveller tr=new Traveller();
       tr.Payment_Calculation(seat_capacity,package_price);
   }
    }
    
}
