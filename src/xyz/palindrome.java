package xyz;


public class palindrome {
	static int reversenumber(int n) {
		int reverse=0;
		while(n>0) {
			reverse=reverse*10+n%10;
			n=n/10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		int n=121;
		int palin=reversenumber(n);
		if(n==palin) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not a Palindrome Number");
		}

	}

}