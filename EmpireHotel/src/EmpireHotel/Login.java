package EmpireHotel;

        import java.util.Scanner;

public class Login  {

   private  String Username;
   private String Password;

    
    void login(){
    Password = "123";
    Username = "wisdom";

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input.next();

    
    System.out.println("Enter Password : ");
    String password = input.next();

    if (username.equals(Username) && password.equals(Password)) {

       System.out.println("Access Granted! Welcome!");
       Reserve res=new Reserve();
       res.reservation();
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } 
    else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    }
    else{ 
        System.out.println("Invalid Username & Password!");
    }
  
    MainPage.main(null);
    }
}
