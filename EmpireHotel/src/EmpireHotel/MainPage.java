
package EmpireHotel;

import java.util.Scanner;



public class MainPage  extends Registration {
    public static void main(String[] args) {
    
    
    System.out.print("1.Registration\n2.Login\n3.Information\n4.Exit\n");
    
    System.out.println("Enter your choice=");
    Scanner input=new Scanner(System.in);
    int choice=input.nextInt();
    
    switch(choice){
        case 1 : 
    Registration reg=new Registration();
    reg.registration();
     break;
        case 2 : 
    Login start =new Login();
    start.login();
    break;
        case 3 :
           Registration dis=new Registration();
           dis.display();
    break;
        case 4 : 
    
    break;
        default:
    System.out.print("please enete write number");
   
}

    }
}