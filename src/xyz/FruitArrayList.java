package xyz;
import java.util.ArrayList;
import java.util.Collections;


public class FruitArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        Collections.sort(fruits);
        System.out.println("Fruits list: " + fruits);
        fruits.remove(1);
        System.out.println("Fruits list: " + fruits);
        fruits.remove("Apple");
        System.out.println("Fruits list: " + fruits);
        System.out.println( fruits.reversed());
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits.indexOf("Mango"));
    }
}