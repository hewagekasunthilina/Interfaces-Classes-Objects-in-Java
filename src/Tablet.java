
public class Tablet extends Item {
	
	private String brand;
	private String model;
	private String camera;
	
	public Tablet(int itemNo, String name, double unitPrice, int qty, String brand, String model, String camera) {
		super(itemNo, name, unitPrice, qty);
		
		this.brand = brand;
		this.model = model;
		this.camera = camera;
		
	}
	

	public void printLine() {
		super.printLine();
		System.out.println("Brand : " +brand+ "Model : " +model+ "Camera : " +camera);
		
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Item Number :"+itemNo);
		System.out.println("Name :"+name);
		System.out.println("Unit Price :"+unitPrice);
		System.out.println("Quantity :"+qty);
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
		System.out.println("Camera :"+camera);
		
		System.out.println("");
	
	
	
	}	
}
