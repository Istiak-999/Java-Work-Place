package package1;
 
import package2.*;


public class Main {

    public static void main(String[] args) {
        
        
    Department dept =new Department("SWE",35);
    Semester sem =new Semester("Spring 2022",221);
    
    Student Stud1= new Student("Shohidul" ,dept,sem,31);
    Student Stud2= new Student("Arpa",dept,sem,31);
    
    System.out.println("Students Information:");
        Stud1.ShowInfo();
        Stud2.ShowInfo();
 
    
    /*Teacher Tec1= new Teacher("710002084", "Md Shohel Arman","Software Engineering","Lecturer(Senior Scale)");
    Teacher Tec2= new Teacher("710001444", "Md. Mushfiqur Rahman","Software Engineering","Lecturer");*/
    
        System.out.println("Teachers Information:");
        //Tec1.ShowInfo1();
        //Tec2.ShowInfo1();
        
    }
    
}
