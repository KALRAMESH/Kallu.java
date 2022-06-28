package com.cg.demo;

public class Palindrome {
	public static void main(String[] args) {
		int num=212,rem,rev=0,temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not a palindrome");
		}

	}
}
