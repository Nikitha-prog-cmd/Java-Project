package xyz;

public class LinearSearchEx {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int target=20;
		boolean found=false;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==target) {
				System.out.println(target+" found at index "+i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("number not found");
		}

	}

}
