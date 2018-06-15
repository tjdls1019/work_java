package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num1 = Double.parseDouble(scanner.nextLine());
		
		if (num1<=50.80) {
			System.out.println("Flyweight");
		}else if (num1<=61.23) {
			System.out.println("Lightweight");
		}else if (num1 <=72.57) {
			System.out.println("Middleweight");
		}else if (num1 <= 88.45) {
			System.out.println("Cruiserweight");
		}else if (num1 > 88.45) {
			System.out.println("Heavtweight");
		}
	}

}
