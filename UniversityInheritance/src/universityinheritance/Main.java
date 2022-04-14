package universityinheritance;
public class Main {
public static void main(String[] args) {
    System.out.println("enter student info:");
    String name = "Shondi Akter";
    Student std1 = new Student(name);
    
    std1.SetPersonValue();
    std1.setStudentValue();
    
   // System.out.println("student information print: ");
   // std1.printPerson();
    //std1.print_student_info();
    
    Course crs= new Course();
    crs.SetCourseValue();
    // course assign to student
    //std1.c_info=crs;
    std1.setCInfo(crs);
    
     std1.printPerson();
    std1.print_student_info();
    
    //std1.Id="1516";
    
    //System.out.println("enter Teacher info:");
    //Teacher tea= new Teacher();
    //tea.SetPersonValue();
    //tea.setTeacherValue();
    //System.out.println("teacher information print: ");
    //tea.printPerson();
    //tea.printTeacherInfo();

  }  
}
