package bcb;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cricketer obj= new Cricketer();
       
        Scanner input = new Scanner(System.in);
        System.out.println("input name:");
        String name = input.nextLine();
        System.out.println("input age:");
        int age= input.nextInt();
        
        obj.setValue(name,age);
        
        System.out.println("input number of match:");
        // input and pass 
        int noOfmatch = input.nextInt(); //25
        double returnValue =obj.calPrizeMoney(noOfmatch);
        System.out.println("total prize money: = " + returnValue);
        
        
        obj.calBonusAmount(noOfmatch);
        obj.totalPrizeWithBonus();
        
        obj.displayInfo();
        
    }
    // string -> int   not newLine
    
    // int -> string  newLine
    
}
