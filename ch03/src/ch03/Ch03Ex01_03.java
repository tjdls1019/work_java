package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		int a = num1++;
		int b = --num2;
				
		System.out.printf("%d ", num1);
		System.out.printf("%d ", num2);
		System.out.printf("%d ", a*b);
	}

}
