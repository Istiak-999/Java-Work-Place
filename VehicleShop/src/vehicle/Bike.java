package vehicle;

public class Bike extends Vehicle {
	private	String brk;
		
		Bike(String company,String model,String color,String brk,int cc,int mileage){
			
			this.company=company;
			this.model=model;
			this.color=color;
			this.brk=brk;
			this.cc=cc;
			this.mileage=mileage;
				
			
		}
		
	void info() {
		
		super.info();
		System.out.println("Break Type="+brk);
	}
}
