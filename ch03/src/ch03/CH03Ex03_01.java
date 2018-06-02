package ch03;

import java.util.Scanner;

public class CH03Ex03_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		
		double a = num1 * num2;
		int b = (int)a;
		int c = (int)num1 * (int)num2;
	
				
	    System.out.printf("%d %d", b, c);
		
	}

}
