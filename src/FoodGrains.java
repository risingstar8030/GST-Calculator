
public class FoodGrains implements Commodity {

	private double unit, price;

	public FoodGrains(double unit, double price) {
		this.unit = unit;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double getUnit() {
		return unit;
	}

	public double getGSTPercentage() {
		return 0;
	}

	@Override
	public void getFinalPrice(GST gst) {
		gst.calculateGST(this);
	}
}
