import java.util.Scanner;

public class DemoPhone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		GSM phone1 = new GSM();
		System.out.println("Input model type for the first phone: ");
		phone1.model = sc.next();
		System.out.println("Input a phone number for the " + phone1.model + ".");
		int phone1Number = sc.nextInt();

		GSM phone2 = new GSM();
		System.out.println("Input model type for the second phone: ");
		phone2.model = sc.next();
		System.out.println("Input a phone number for the " + phone2.model + ".");
		int phone2Number = sc.nextInt();

		phone1.insertSimCard(phone1Number);
		phone2.insertSimCard(phone2Number);

		System.out.println("The " + phone1.model + " is calling the " + phone2.model + ". Please insert a duration for the call: ");
		int durationOfCall = sc1.nextInt();

		phone1.call(phone2, durationOfCall);
		System.out.println("The call's price is: ");
		phone1.getSumForCall();
		
		phone1.printInfoForTheLastOutgoingCall();
		phone1.printInfoForTheLastIncomingCall();
		phone2.printInfoForTheLastOutgoingCall();
		phone2.printInfoForTheLastIncomingCall();
		
		sc.close();
		sc1.close();
	}
}
