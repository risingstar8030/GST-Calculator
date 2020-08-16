import java.text.DecimalFormat;

public class GstCalculator implements GST {

	DecimalFormat df = new DecimalFormat("#.##");

	// Calculates GST value and Final Price for FoodGrains

	@Override
	public void calculateGST(FoodGrains foodItem) {

		double gstValue = Double.parseDouble(df.format(foodItem.getPrice() * foodItem.getGSTPercentage()));
		double finalPrice = Double.parseDouble(df.format(foodItem.getUnit() * (foodItem.getPrice() + gstValue)));

		System.out.print("GST Per Unit : " + gstValue + "\tFinal Price : " + finalPrice + "\n");

	}

	// Calculates GST value and Final Price for Furniture

	@Override
	public void calculateGST(Furniture furnitureItem) {

		double gstValue = Double.parseDouble(df.format(furnitureItem.getPrice() * furnitureItem.getGSTPercentage()));
		double finalPrice = Double
				.parseDouble(df.format(furnitureItem.getUnit() * (furnitureItem.getPrice() + gstValue)));

		System.out.print("GST Per Unit : " + gstValue + "\tFinal Price : " + finalPrice + "\n");

	}

	// Calculates GST value and Final Price for Electronics

	@Override
	public void calculateGST(Electronics electronicsItem) {

		double gstValue = Double
				.parseDouble(df.format(electronicsItem.getPrice() * electronicsItem.getGSTPercentage()));
		double finalPrice = Double
				.parseDouble(df.format(electronicsItem.getUnit() * (electronicsItem.getPrice() + gstValue)));

		System.out.print("GST Per Unit : " + gstValue + "\tFinal Price : " + finalPrice + "\n");

	}

	// Calculates GST value and Final Price for Cosmetics

	@Override
	public void calculateGST(Cosmetics cosmeticsItem) {

		double gstValue = Double.parseDouble(df.format(cosmeticsItem.getPrice() * cosmeticsItem.getGSTPercentage()));
		double finalPrice = Double
				.parseDouble(df.format(cosmeticsItem.getUnit() * (cosmeticsItem.getPrice() + gstValue)));

		System.out.print("GST Per Unit : " + gstValue + "\tFinal Price : " + finalPrice + "\n");

	}

}
