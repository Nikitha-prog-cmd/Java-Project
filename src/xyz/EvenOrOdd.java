package xyz;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}

	}

}