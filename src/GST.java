
public interface GST {

	// Method Overloading : Method is selected according to item

	public void calculateGST(FoodGrains foodItem);

	public void calculateGST(Furniture furnitureItem);

	public void calculateGST(Electronics electronicsItem);

	public void calculateGST(Cosmetics cosmeticsItem);

}
