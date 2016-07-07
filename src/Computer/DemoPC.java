package Computer;
public class DemoPC {

	public static void main(String[] args) {
		String desktop = "Desktop";
		String notebook = "Notebook";
		
		Computer firstPC = new Computer();
		Computer secondPC = new Computer();
		
		firstPC.year = 2011;
		firstPC.price = 800.00d;
		firstPC.isNotebook = false;
		firstPC.hardDiskMemory = 3072;
		firstPC.freeMemory = 2048;
		firstPC.operationSystem = "Windows";
		
		secondPC.year = 2015;
		secondPC.price = 2400.00d;
		secondPC.isNotebook = true;
		secondPC.hardDiskMemory = 1024;
		secondPC.freeMemory = 512;
		secondPC.operationSystem = "Linux";
		
		secondPC.useMemory(100);
		firstPC.changeOperationSystem("Linux");
		
		System.out.println("The first PC stats " + "(" + ((firstPC.isNotebook) ? notebook : desktop) + ") are: ");
		System.out.println("Year of manufacture: " + firstPC.year);
		System.out.println("Price: " + firstPC.price);
		System.out.println("Total memory: " + firstPC.hardDiskMemory + " Free memory: " + firstPC.freeMemory);
		System.out.println("Operating under " + firstPC.operationSystem + ".\n");
		
		System.out.println("The second PC stats " + "(" + ((secondPC.isNotebook) ? notebook : desktop) + ") are: ");
		System.out.println("Year of manufacture: " + secondPC.year);
		System.out.println("Price: " + secondPC.price);
		System.out.println("Total memory: " + secondPC.hardDiskMemory + " Free memory: " + secondPC.freeMemory);
		System.out.println("Operating under " + secondPC.operationSystem + ".");
	}

}
