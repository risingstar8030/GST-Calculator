
public class Main {

	public static void main(String[] args) {
		
		GstCalculator gstCalc = new GstCalculator();
		
		FoodGrains rice = new FoodGrains(1, 100);
		Furniture sofa = new Furniture(1, 20000);
		Cosmetics perfume = new Cosmetics(1, 200);
		Electronics mobile = new Electronics(2, 5000);
		
		rice.getFinalPrice(gstCalc);
		sofa.getFinalPrice(gstCalc);
		perfume.getFinalPrice(gstCalc);
		mobile.getFinalPrice(gstCalc);
		
	}
}

/*
Output : 

	GST Per Unit : 0.0		Final Price : 100.0
	GST Per Unit : 1000.0	Final Price : 21000.0
	GST Per Unit : 56.0		Final Price : 256.0
	GST Per Unit : 900.0	Final Price : 11800.0

*/