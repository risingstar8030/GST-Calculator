import java.util.Scanner;

public class Input {

	Scanner sc = new Scanner(System.in);

	String item;
	double unit, price;

	public double Unit() {

		System.out.print("Enter Number of Units: ");
		while (!sc.hasNextInt()) {
			System.out.println("That's not a number!");
			sc.next();
		}
		unit = sc.nextInt();

		return unit;
	}

	public double Price() {

		System.out.print("Enter Price per Unit: ");
		while (!sc.hasNextInt()) {
			System.out.println("That's not a number!");
			sc.next();
		}
		price = sc.nextInt();

		return price;
	}

	public String Item() {

		System.out.print("Enter Item Name: ");
		while (!sc.hasNext("[A-Za-z]+")) {
			System.out.println("That's not a item");
			sc.next();
		}
		item = sc.next();

		return item;
	}

}
