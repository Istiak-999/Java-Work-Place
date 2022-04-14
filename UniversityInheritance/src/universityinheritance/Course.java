
package universityinheritance;
//course title, course code, total enrolled student, and total credit hou
import java.util.Scanner;
public class Course {
   protected String title;
   protected String code;
   protected  int creditH;
   protected  int totalEnStd;
   Scanner input = new Scanner(System.in);
   public void SetCourseValue(){
        System.out.println("input course info: ");
        System.out.println("input title: ");
        title=input.nextLine();
        System.out.println("input code: ");
        code=input.nextLine();
        System.out.println("input creditH: ");
        creditH=input.nextInt();
        totalEnStd=0;
        input.nextLine();
    }

    void incStudent() {
       totalEnStd+=1;
    }
}
