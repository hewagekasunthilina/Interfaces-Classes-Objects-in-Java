
public class Vegetables extends Item {
	public Vegetables(int itemNo, String name, double unitPrice, int qty) {
		super(itemNo, name, unitPrice, qty);
	}

	private boolean Organic;
	private String calories;
	
	public Vegetables(int itemNo, String name, double unitPrice, int qty, String organic, String calories) {
		super(itemNo, name, unitPrice, qty);
		Organic = Organic;
		this.calories = calories;
	}
	
	@Override
	public void printLine() {
		super.printLine();
		System.out.println("Organic(True/False) :"+Organic+ "Calories :"+calories);
		
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Item Number :"+itemNo);
		System.out.println("Name :"+name);
		System.out.println("Unit Price :"+unitPrice);
		System.out.println("Quantity :"+qty);
		System.out.println("Organic (True/False) :"+Organic);
		System.out.println("Calories :"+calories);
	}
}
