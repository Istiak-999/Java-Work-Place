
package package2;

public class Student extends Person{
    private String Id;
    private int Batch;
    private Semester AdmissionSemester=new Semester();
    private final int lastSerial=2000;
    private static int count;
    
    public Student(String Name, Department dept, Semester sem,int Batch){
    this.Name=Name;
    this.dept=dept;    
    this.Batch=Batch;
    this.AdmissionSemester=sem;
    count++;
    this.Id=generateID();
    
    }
    
    public String generateID(){
    int serial=lastSerial+count;
    return AdmissionSemester.getCode()+"-"+dept.getCode()+"-"+serial;
        
    }

    
    @Override
    public void ShowInfo(){
    
    System.out.println("Id : "+Id);
    super.ShowInfo();
    System.out.println("Batch : "+Batch);
    System.out.println("Semester: "+AdmissionSemester.getName());
    System.out.println();
    } 
}
