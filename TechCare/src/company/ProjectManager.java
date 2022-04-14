package company;

public class ProjectManager extends Person {
	//name,age,id,phone
	ProjectManager(String name,int age,int id,int phone){
		
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.id=id;	
		
	}
	
	
	 double a=Salary.totalSalary(40000);
	
	void view() {
		super.view();
		
		Salary.totalSalary(40000);
		System.out.println("Salary= "+a+"\n");
		
		
		
	}

}
