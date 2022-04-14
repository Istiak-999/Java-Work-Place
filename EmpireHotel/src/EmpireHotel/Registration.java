
package EmpireHotel;

import java.util.Scanner;


public class Registration {
          



   public String username;
   public String password;
   public String name;
   public int age;
   public String address;
   public String blood;
   public  Long phone;
    
    
    void registration(){
   
    
    Scanner input =new Scanner(System.in);
    System.out.println("Enter your name :");
    name=input.next();
    
    
    System.out.println("Enter your age :");
     age=input.nextInt();
    
    
    System.out.println("Enter your phone number :  ");
     phone=input.nextLong();

    
    System.out.println("Enter your address : ");
    address=input.next();
    
  
    System.out.println("Blood Group : ");
    blood = input.next();
    
  
    System.out.println("Enter Username : ");
    username = input.next();
    
    
    System.out.println("Enter Password : ");
    password = input.next();
    
    
    System.out.println("Enter Password again : ");
    String password2 = input.next();
    
   
if(password.equals(password2))
     
     {

        System.out.println("registration successfull");
    }
    else {
        System.out.println("Invalid Username or Password!");
    }

 display();
  }
    
  void display(){
      System.out.println("Press 1 for see information or press 2 for exit");

Scanner input8=new Scanner(System.in);
int n=input8.nextInt();
        //ekhan theke information class e info show korbe
        switch (n) {
            case 1:
                Information obj = new Information();
                obj.info(name,age,phone,address,blood);
                break;
            case 2:
                MainPage.main(null);
                break;
            default:
                System.out.println("Wrong input");
                MainPage.main(null);
                break;
        }
  }  
}
