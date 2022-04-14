package company;

public class Software_Engineer extends Person {
	
	Software_Engineer(String name,int age,int id,int phone){
		
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.id=id;	
		
		
	}
	
	
    double a=Salary.totalSalary(20000);
    
    
	void view() {
		
		super.view();
	
		System.out.println("Salary= "+a+"\n");
		
		
	}

}
