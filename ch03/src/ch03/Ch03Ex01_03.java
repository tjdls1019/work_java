package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		// Integer.parseInt(scanner.nextLine()) 친뒤 변수에  ctrl + 1
		// int num1 = Integer.parseInt(scanner.nextLine())
		// int num1 = Integer.parseInt(scanner.nextLine())
		
		int a = num1++;  // a에는 num1이 1증가하기 전 값이 저장됨
		int b = --num2;  // b에는 num2가 1감소 후 값이 저장됨
		// int mul = a*b; // 증가 전 값과 감소 후 값을 곱한 값 저장
		
		System.out.printf("%d ", num1);
		System.out.printf("%d ", num2);
		System.out.printf("%d ", a*b);
	}

}
