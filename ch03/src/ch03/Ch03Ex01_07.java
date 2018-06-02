package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		
		//boolean isNum1Big01 = num1> num2;   // num1이 num2보다 크면true
		//boolean isNum1Big02 = num1> num3;   // num1이 num3보다 크면true
		//boolean isNum1Big = isNum1Big01 && isNum1Big02;   // 두 결과 모두 true면 num1이 가장 크다
		
		// boolean isSame01 = num1 == num2;    // num1과 num2가 같으면 true
		// boolean isSame02 = num1 == num3;    // num1과 num3가 같으면 true
		// boolean isSame = isame01 && isSame02;  // 두 겨로가 모두 true면 세 개의 수가 모두 같다.
		
		System.out.printf("%b ", num1 > num2 && num1 > num3);
		System.out.printf("%b ", num1 == num2 && num1 == num3);
	}

}
