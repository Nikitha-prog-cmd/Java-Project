package xyz;

import java.util.LinkedHashMap;

public class LinkHM {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lm=new LinkedHashMap<Integer,String>();
        lm.put(101,"aba");
        lm.put(102, "jkl");
        lm.put(103, "soh");
        System.out.println(lm);
	}

}
