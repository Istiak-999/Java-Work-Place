package hotel;

import java.util.Scanner;

public class FoodItem {
	int id;
	String name;

	public void menu() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] s = new String[] { "idly    ", "wada    ", "dosa    ", "poori     ", "pesarattu", "uttapam",
				"bonda     ", "tea   ", "coffee    ", "Quit     " };
		int[] rate = new int[] { 30, 35, 40, 30, 25, 30, 25, 10, 15, 0 };
		int[] qt = new int[10];
		int sum = 0;
		boolean quit = true;

		do {
			System.out.println("ITEM" + "\t\t\tPrice");
			for (int i = 0; i < 10; i++)
				System.out.println((i + 1) + "." + s[i] + "\t\t" + rate[i]);

			id = sc.nextInt();
			if (id > 0 && id < 10) {
				System.out.println("enter the no of quantites of " + s[id - 1]);
				int q = sc.nextInt();
				qt[id - 1] += q;

			} else {
				quit = false;

			}

		} while (quit);

		System.out.println("Your Orders are:\n");
		for (int i = 0; i < 10; i++) {
			if (qt[i] != 0) {
				sum += qt[i] * rate[i];
				System.out.println(s[i] + "*   " + qt[i] + "==" + qt[i] * rate[i] + "rs");
			}
		}

		System.out.println("Your total bill=" + sum);

		System.out.println("Thank you");

	}

}