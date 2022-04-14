package universityinheritance;

public class Teacher extends Person{
    private String empId;
    private double mSalary;
    
    public void setTeacherValue(){
        System.out.println("input teacher info:");
        System.out.println("input empId:");
        empId=input.nextLine();
        System.out.println("input mSalary:");
        mSalary=input.nextDouble();
    }
  
    public void printTeacherInfo(){
        System.out.println("empId = " + empId);
        System.out.println("mSalary = " + mSalary);
    }
}
