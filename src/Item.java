
public abstract class Item implements IPrint {

	protected int itemNo;
	protected String name;
	protected double unitPrice;
	protected int qty;
	
	public Item(int itemNo, String name, double unitPrice, int qty) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}

	@Override
	public void printLine() {
		System.out.println("itemNo : " +itemNo+ "Name : " +name+ "Unit Price : " +unitPrice+ "Quantity : " +qty);
	}

	@Override
	public void printDetails() {
		System.out.println("Item Number :"+itemNo);
		System.out.println("Name :"+name);
		System.out.println("Unit Price :"+unitPrice);
		System.out.println("Quantity :"+qty);
		
		System.out.println("");
	}

}
