package xyz;
import java.util.HashMap;

public class HashMapExample {
	public static void main (String[] args) {
		HashMap<Integer,String> Student  = new HashMap<Integer,String> ();
		Student.put(1,"Pallavi");
		Student.put(2,"Nikitha");
		Student.put(3,"Sneha");
		Student.put(4,"Manjula");
		Student.put(5,"Mahidhar");
		Student.remove(5);
		System.out.println(Student);
		Student.put(3, "Nivika");
		System.out.println(Student);
		for(Integer  rollNo: Student.keySet()) {
			System.out.println("Roll No: " +rollNo  + ",Name: " + Student.get(rollNo));
			
		}
			
	}

}