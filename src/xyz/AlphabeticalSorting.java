package xyz;
import java.util.*;
public class AlphabeticalSorting {
	

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Nikitha");
		names.add("Mahidar");
		names.add("Alice");
		names.add("Charlie");
		names.add("Bob");
		Collections.sort(names);
		System.out.println(names);
	
	}

}
