package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		// 1. 두 정수 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		//String[] numbers = scanner.nextLine().split(" ");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		// int width = Integer.parseInt(numbers[0]);
		// int length = Integer.parseInt(numbers[1]);
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		// width +=5;
		//length *= 2;
		int width = num1 +5;
		int length = num2*2;
		int area = width * length;
				
	    System.out.printf(" width = %d%n length = %d%n area = %d", width, length, area);
	}

}
