package com.cg.demo.cls;
import java.util.Scanner;
public class BerthTrain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome\n Please enter birthNumber");
		int berthNumber = sc.nextInt();
		String berthType = "";

		if (berthNumber < 1 || berthNumber > 72) {
			System.out.println("Wrong input!");
		} 
		else if (berthNumber % 8 == 1 || berthNumber % 8 == 4) {
			berthType = "lower";
		} 
		else if (berthNumber % 8 == 2 || berthNumber % 8 == 5) {
			berthType = "middle";
		}
		else if (berthNumber % 8 == 3 || berthNumber % 8 == 6) {
			berthType = "upper";
		}
		else if (berthNumber % 8 == 7) {
			berthType = "side-lower"; 
		}
		else {
			berthType = "side-upper";
		}

		System.out.println(berthNumber);
		System.out.println(berthType);
	}

}
