package xyz;

public class ConstantTimeExample {
	
	public static void printFirstElement(int[] arr) {
		if(arr.length>0) {
			System.out.println("First element is:"+arr[0]);
		}else {
			System.out.println("Array is empty.");
		}
	}

	public static void main(String[] args) {
	     int[] numbers= {10,20,30,40,50,60,7,80,90,22,22,44,55,66,77,88,99,31,32,43,57};
	     printFirstElement(numbers);
    }
}
