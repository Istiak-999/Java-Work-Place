package universityinheritance;
 //has Student Id and Course information that he has enrolled in.
public class Student extends Person{  // person is a parent   Student is a child
   protected String Id;
   public Course c_info;
   final double pi;
   Student(String n){
    super(n);
    c_info= new Course();
    pi=3.1416;
   }

   public void setStudentValue(){
      System.out.println("input student info:");
      System.out.println("input Id:");
      Id=input.nextLine();
      super.fName="Zim";
      super.SetPersonValue();
       System.out.println("pi = " + pi);
   }
   public void print_student_info(){
       System.out.println("Id = " + Id);
       System.out.println("code = " + c_info.code);
       System.out.println("title = " + c_info.title);
       System.out.println("creditH = " + c_info.creditH);
   }
   public void setCInfo(Course c){
       c_info=c;
   }
}
