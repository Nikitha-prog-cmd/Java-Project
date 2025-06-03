package xyz;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("Niki", 100);
		tm.put("mahi", 90);
		tm.put("nivi", 80);
		System.out.println(tm);
		System.out.println(tm.get("nivi"));
		System.out.println(tm.containsKey("nivi"));
		TreeMap<String,Long> tmm=new TreeMap<>();
		tmm.put("nikitha", 9895239457L);
		tmm.put("nivika",  9612374698L);
		System.out.println(tmm);
	}

}
