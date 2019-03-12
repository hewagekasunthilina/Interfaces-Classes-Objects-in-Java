
public class MainApp {

	public static void main(String[] args) {
		
		IPrint my1 = new Tablet(1, "Hansi", 65000, 1, "Nikon", "D3300", "DSLR");
		my1.printLine();
		my1.printDetails();
		
		
		IPrint my2 = new Tablet(2, "Kasun", 90000, 1, "Cannon", "90D", "DSLR");
		my2.printLine();
		my2.printDetails();
		
		IPrint my3 = new Vegetables(3, "Pasun", 90, 2, "True", "5");
		my3.printLine();
		my3.printDetails();
		
		IPrint my4 = new Vegetables(4, "Dasun", 80, 3, "True", "5");
		my4.printLine();
		my4.printDetails();
		
		IPrint arr[] = new IPrint[4];
		arr[0] = my1;
		arr[1] = my2;
		arr[2] = my3;
		arr[3] = my4;
		
		for(int i =0; i < 4; i++){
			arr[i].printLine();
			System.out.println();
		}
		
		for(int i=0; i<4; i++){
			arr[i].printDetails();
			System.out.println();
		}
	}

}
