package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers01 = scanner.nextLine().split(" ");
		
		double num1 = Double.parseDouble(numbers01[0]);
		double num2 = Double.parseDouble(numbers01[1]);
		
		
		
			
		if (num1 >= 4.0 && num2 >= 4.0) {
			System.out.println("A");
		}else if ( num1 > 3.0 && num2 >= 3.0) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		
	}

}
