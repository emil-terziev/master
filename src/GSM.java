
public class GSM {

	String model;
	boolean hasSimCard;
	int simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	public void insertSimCard(int simMobileNumber) {
		//tozi metod chupi cqlata programa i ne shvashtam kakvo ne mu haresva...uj tozi na4in chrez String raboteshe
		if (("" + simMobileNumber).substring(0, 2) == "08" && ("" + simMobileNumber).length() == 10) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		} else {
			System.out.println("Invalid number!");
		}
	}

	public void removeSimCard() {
		this.hasSimCard = false;
	}

	public void call(GSM receiver,int duration) {
		if (duration < 0 || this.simMobileNumber == receiver.simMobileNumber || !this.hasSimCard || !receiver.hasSimCard) {
			System.out.println("Invalid call!");
		} else {
			Call testCall = new Call();
			testCall.duration = duration;
			testCall.receiver = receiver;
			testCall.caller = this;
			
			this.lastOutgoingCall = testCall;
			receiver.lastIncomingCall = testCall;
			this.outgoingCallsDuration += testCall.duration;
		}
	}

	public void getSumForCall() {
		System.out.println(this.outgoingCallsDuration * Call.priceForAMinute);
	}

	public void printInfoForTheLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println(this.model + "'s(" + this.simMobileNumber + ") last outgoing call's duration " + Call.duration);
		}
	}

	public void printInfoForTheLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			System.out.println(this.model + "'s(" + this.simMobileNumber + ") last incoming call's duration " + Call.duration);
		}
	}
}
