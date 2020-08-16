
public class Cosmetics implements Commodity {

	private double unit, price;

	public Cosmetics(double unit, double price) {
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
		return 0.28;
	}

	@Override
	public void getFinalPrice(GST gst) {
		gst.calculateGST(this);
	}
}
