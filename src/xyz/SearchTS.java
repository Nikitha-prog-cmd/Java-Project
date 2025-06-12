package xyz;

import java.util.Scanner;
import java.util.TreeSet;

public class SearchTS {
	public static void main(String[] args) {
		TreeSet<String> ProductNames = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the productname : ");
		String s = sc.nextLine();
		ProductNames.add("keyboard");
		ProductNames.add("mouse");
		ProductNames.add("monitor");
		ProductNames.add("CPU");
		ProductNames.add("Webcam");
		if(ProductNames.contains(s)) {
			System.out.println("Exists");
			
			
		}else {
			System.out.println("not exists");
		}
		sc.close();		
	}

}
