package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);	
		//1. 정수 2개 입력받기
		// int num1 = Integer.parseInt(scanner.nextLine())
		// int num1 = Integer.parseInt(scanner.nextLine())
		// 2. 첫 번째 수에는 100을 증가, 두번째 수는 10으로 나눈 ㅁ나머지 저장
		//int res1 = num1 + 100
		
		System.out.printf("%d%n", num1 + 100);
		System.out.printf("%d", num2 % 10);
		
	    
	}

}
