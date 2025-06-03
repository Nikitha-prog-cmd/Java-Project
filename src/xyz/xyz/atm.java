package xyz;
abstract class machine{
	abstract void ATM();
	public void ATM2() {
		System.out.println("ATM USING JAVA WITH PHP");
	}
}
class Bank extends machine{
	void ATM(){
		System.out.println("ATM USING JAVA");
	}
}

public class atm {

	public static void main(String[] args) {
		Bank b=new Bank();
	    b.ATM();
	    b.ATM2();

	}

}
