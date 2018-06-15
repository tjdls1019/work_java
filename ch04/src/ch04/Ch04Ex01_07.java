package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input =scanner.nextLine();
		// char input = scanner.nextLine().charAt(0);
		
		
		if (input.equals("A")) {
			System.out.println("Excellent");
		}else if (input.equals("B")) {
			System.out.println("Good");
		}else if (input.equals("C")) {
			System.out.println("Usually");
		}else if (input.equals("F")) {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}
			
		
	}

}
