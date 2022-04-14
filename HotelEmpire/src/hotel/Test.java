package hotel;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println(
				"[1]Represents viewing a list of rooms\n[2]Food Item\n[3]Customer details\n[4]Bill\n[0]Indicates exit from the system");
		while (true) {
			System.out.println("Please enter the number:");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if (i == 1) {
				Room r1 = new Room();
				r1.cal();
			} else if (i == 2) {
				FoodItem m1 = new FoodItem();
				m1.menu();

			} else if (i == 3) {
				Customer customer = new Customer(1, "adam.stanlely@gmail.com");
				Person person = new Person("Adam Stanley", 818223433, "Randolf Street");

				System.out.println(
						"   Name             Phone Number       Address          Customer Number         Customer E-Mail");

				System.out.println("   " + person.getName() + "     " + person.getphoneNumber() + "          "
						+ person.getaddress() + "          " + customer.getCustomerNumber() + "              "
						+ customer.geteMail());
			} else if (i == 4) {
				Bill b1 = new Bill();
				b1.bill();

			} else if (i == 0) {
				System.out.println("Welcome next time!");

			} else {
				System.out.println("Wrong input number, please re-enter:");
			}
		}
	}

}