package com.cg.demo.obj;

import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("welcome to Scanner Demo App:");
	Scanner sc= new Scanner(System.in);
	System.out.println("please enter your name:");
	String myName=sc.next();
	System.out.println("myName");
	System.out.println("please enter your salary:");
	double salary=sc.nextDouble();
	System.out.println(salary);
	System.out.println("Please enter phone number");
	long phoneNumber=sc.nextLong();
	System.out.println(phoneNumber);
	System.out.println("Thank u for using this App");

}
}
