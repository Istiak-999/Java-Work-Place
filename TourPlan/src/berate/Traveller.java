package berate;


import java.util.Scanner;


public class Traveller {
   String tid,tname,country;
   int choice;
   
  // Scanner sc= new Scanner(System.in);
   public void choose(){
       Scanner sc= new Scanner(System.in);
       System.out.println("Press 1 if you registered or press 2 if you unregistered...");
       choice=sc.nextInt();
       switch (choice) {
           case 1:
               T();
               break;
   
           case 2:
               Buy_Package();
               break;
           default:
               System.out.println("Invalid input");
               break;
       }
   }
   
  private void  T(){
       
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your Id=");
    tid= sc.nextLine();
    
    System.out.println("Enter your name=");
    tname= sc.nextLine();
    
    System.out.println("Enter your Country=");
    country= sc.nextLine();
    Buy_Package();
    }


private void Buy_Package(){

System.out.println("\n1.Winter Package\n2.Summer Package\n3.Other packages");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
       switch (n) {
           case 1:
               {
                   WinterPackage pack=new WinterPackage();
                   pack.winter();
                   pack.package_details();
                   
                   break;
               }
           case 2:
               {
                   SummerPackage pack=new SummerPackage();
                    pack.summer();
                   pack.package_details();
                  
                   break;
               }
       
           case 3:
           {
               TourPackage pack=new TourPackage();
               pack.package_details();
           }
               break;
           default:
               System.out.println("Invalid input");
               break;
       }

}
public void Payment_Calculation(int n,int cost){
    
    int total=n*cost;
    double rslt;
    if(choice==1){
       rslt=(total-0.1*total);
        System.out.println("Total cost="+rslt);
    }
    else
    {
       rslt=(total+0.02*total);
        System.out.println("Total cost="+rslt);
    }
    
}


}