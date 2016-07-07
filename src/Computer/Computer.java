package Computer;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {		
		this.isNotebook = false;		
		this.operationSystem = "Win XP";
	}
	
	Computer (int year,double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = 2000;
		this.price = 1399.99d;
		this.hardDiskMemory = 1024;
		this.freeMemory = 348;
	}
	
	Computer(int year,double price,boolean isNotebook, double hardDiskMemory, double freeMemory,String operationSystem) {
		
	}
	
	int comparePrice(Computer c) {
		
	}

	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null && !newOperationSystem.equals("")) {
			this.operationSystem = newOperationSystem;
		} else {
			System.out.println("There's no such operating system!");
		}
	}

	void useMemory(long memory) {
		if (freeMemory < 0) {
			System.out.println("Did You forget the hard disk?");
		} else {
			if (freeMemory < memory) {
				System.out.println("Not enough free memory!");
			} else {
				this.freeMemory -= memory;
			}
		}
	}
}
