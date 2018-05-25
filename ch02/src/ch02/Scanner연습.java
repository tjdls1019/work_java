package ch02;

import java.util.Scanner;

public class Scanner연습 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); 
		//int num = scanner.nextInt();
		
	    System.out.printf("num=%d%n", num);
		System.out.printf("num=%o%n", num);
		System.out.printf("num=%x%n", num);
	}

}
