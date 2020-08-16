
public class Furniture implements Commodity {

	private double unit, price;

	public Furniture(double unit, double price) {
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
		return 0.05;
	}

	@Override
	public void getFinalPrice(GST gst) {
		gst.calculateGST(this);
	}
}
