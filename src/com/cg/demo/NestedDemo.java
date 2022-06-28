package com.cg.demo;

public class NestedDemo {
	public static void main(String[] args) {
		System.out.println("weekend plan");
		int mood=1;
		int friends=2;
		if(mood==1) {
			if(friends==1) {
				System.out.println("mood good, friends available--Shopping");
			}
			else {
				System.out.println("mood good, friends not available---Painting");
			}
		}
			else {
				if (friends==1) {
					System.out.println("mood not good, friends not available---Sleeping");
				}
				else {
				System.out.println("mood not good, friends available---tv");	
					
				}
					
				}
	}
}


