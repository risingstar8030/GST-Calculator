import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		GstCalculator gstCalc = new GstCalculator();
		Input ip = new Input();

		while (true) {

			int choice;
			double unit, price;
			String item;

			System.out.println("1: FoodGrains 2: Furniture 3:Cosmetics 4: Electronics");

			while (!sc.hasNextInt()) {
				System.out.println("That's not a number!");
				sc.next();
			}
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				
				item = ip.Item();

				unit = ip.Unit();

				price = ip.Price();
				
				System.out.println("GST And Final Price of : "+item);
				
				FoodGrains foodItem = new FoodGrains(unit, price);
				foodItem.getFinalPrice(gstCalc);
				
				break;

			case 2:
				
				item = ip.Item();

				unit = ip.Unit();

				price = ip.Price();
				
				System.out.println("GST And Final Price of : "+item);
				
				Furniture furnitureItem = new Furniture(unit, price);
				furnitureItem.getFinalPrice(gstCalc);
				
				break;
			
			case 3:
				
				item = ip.Item();

				unit = ip.Unit();

				price = ip.Price();
				
				System.out.println("GST And Final Price of : "+item);

				Cosmetics cosmeticsItem = new Cosmetics(unit, price);
				cosmeticsItem.getFinalPrice(gstCalc);
				
				break;
				
			case 4 : 
				
				item = ip.Item();

				unit = ip.Unit();

				price = ip.Price();
				
				System.out.println("GST And Final Price of : "+item);

				Electronics electronicsItem = new Electronics(unit, price);
				electronicsItem.getFinalPrice(gstCalc);
				
				break;

			default:
				System.out.println("Please, Enter valid input");
			}
		}

	}
}
