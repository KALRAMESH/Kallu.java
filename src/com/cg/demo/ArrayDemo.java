package com.cg.demo;

public class ArrayDemo {
	public static void main(String[] args) {
		int[]marks={98,95,97,96,92};
		System.out.println("print an elments using for loop:");
		for(int i=1;i<=4;i++) {
			System.out.println(i);
			System.out.println(marks);
		}
		System.out.println("print an elments using index:");
		System.out.println(marks[2]);
		System.out.println("print all element using each for loop: ");
		for(int element:marks) {
		System.out.println(element);

	}

}
}