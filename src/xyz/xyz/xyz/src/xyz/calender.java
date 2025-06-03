package xyz;
import java.util.Scanner;

public class calender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Day = sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday" :
			System.out.println("let's learn python");
			break;
		case "tuesday" :
			System.out.println("let's learn java" );
			break;
		case "wednesday" :
			System.out.println("let's learn js");
			break;
		case "thursday" :
			System.out.println("let's learn Swift");
			break;
		case "friday" :
			System.out.println("let's learn Ruby");
			break;
		case "saturday" :
			System.out.println("let's learn Scala");
			break;
		case "sunday" :
			System.out.println("let's learn C");
			break;
		default :
			System.out.println("let's learn c++");
		}
		
	}

}