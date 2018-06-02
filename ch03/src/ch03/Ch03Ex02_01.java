package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. 두 정수를 가로로 입력받기(배열 필요)
		//String [] numbers = scanner.nextLine().split(" ");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		// int num1 = Integer.parseInt(numbers[0]);
		// int num2 = Integer.parseInt(numbers[1]);
		
		// int quotient = num1 / num2;
		// int remainder = num1 % num2;
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d / %d = %d...%d", num1, num2, num1 / num2, num1 % num2 );
	}

}
