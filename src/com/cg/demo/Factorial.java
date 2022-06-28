package com.cg.demo;

public class Factorial {
	public static void main(String[] args) {
		factorial(3);
	}
	public static void factorial(int num)
	{
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
			{
				System.out.println("The factoraial number is"+factorial);
			}
		}
		
	}

}
