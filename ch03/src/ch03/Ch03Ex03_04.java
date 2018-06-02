package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		double num3 = Double.parseDouble(input3);
		
		int sum = (int)num1 + (int)num2 + (int)num3;
		double a = (num1 + num2 + num3)/3; 
		int avg = (int)a;
				
		System.out.printf("sum %d%navg %d", sum, avg);
		
	}

}
