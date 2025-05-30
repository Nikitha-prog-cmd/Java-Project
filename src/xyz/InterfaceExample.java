package xyz;
interface PrintTable{
	void print();
}
class message implements PrintTable{
	public void print() {
		System.out.println("Hello From Interface");
	}
}

public interface InterfaceExample {
	public static void main(String[] args) {
		message msg=new message();
		msg.print();
	}

}
