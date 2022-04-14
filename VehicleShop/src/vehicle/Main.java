package vehicle;

public class Main {

	public static void main(String[] args) {

		Vehicle c1 = new Car("ABCD CO", "P90", "Black", 6, 4, 1500, 45);// created super classes reference
		Vehicle c2 = new Car("ABCD CO", "M60", "Brown", 4, 4, 1500, 38);
		Bike b1 = new Bike("unknown CO", "P40", "Brown", "Hand Break", 150, 32);
		Bike b2 = new Bike("unknown CO", "P10", "Brown", "Emergency Break", 150, 65);
		c1.info();
		System.out.println();
		c2.info();
		System.out.println();
		b1.info();
		System.out.println();
		b2.info();

	}

}
