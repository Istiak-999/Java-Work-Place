package vehicle;

public class Car extends Vehicle {
	private int seat,door;
	
	Car(String company,String model,String color,int seat,int door,int cc,int mileage){
		
		this.company=company;
		this.model=model;
		this.color=color;
		this.seat=seat;
		this.door=door;
		this.cc=cc;
		this.mileage=mileage;
		
	}
	
	
void info() {
	
	super.info();
	System.out.println("Seat Number="+seat+"\nDoor Number="+door);
	
}
}
