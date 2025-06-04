package xyz;
import java.util.Stack;

public class Kitchen {
	public static void main(String[]args) {
		Stack<String> plates = new Stack<String>();
		plates.push("plate 1");
		plates.push("plate 2");
		plates.push("plate 3");
		plates.push("plate 4");
		plates.push("plate 5");
		System.out.println("to eat take"+plates.pop());
		System.out.println("remaining plates");
		System.out.println(plates);
		
	}
	

}