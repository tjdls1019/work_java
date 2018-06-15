package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.nextLine());
		
		if (num1 >= 20) {
			System.out.println("adult");
		} else {
			System.out.printf("%d years later", 20-num1);
		}
	}

}
