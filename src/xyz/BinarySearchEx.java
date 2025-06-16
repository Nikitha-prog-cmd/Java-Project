package xyz;

public class BinarySearchEx {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int target=40;
		int left=0;
		int right=arr.length-1;
		boolean found=false;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println(target+" found at index "+mid);
				found=true;
				break;
			}else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			
		}
		if(!found) {
			System.out.println("number not found");
		}
	}

}
