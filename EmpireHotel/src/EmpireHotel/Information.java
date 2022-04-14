
package EmpireHotel;

public class Information {
    
    public void info(String name1,int age1, Long phone1, String address1, String bg)
    {
        
    System.out.println("Your registered information's are :");
    System.out.print("Name: "+name1+"\nAge: "+ age1 +"\nPhone: "+phone1+"\nAddress: "+address1+"\nBlood Group:"+bg+"\n");
        
//will back to main page
MainPage.main(null);
        
    }
     

}

