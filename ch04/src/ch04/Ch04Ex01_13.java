package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요.> ");
		
		int num = Integer.parseInt(scanner.nextLine());
	
		if (num ==1) {
			System.out.println("dog");
		}else if (num == 2) {
			System.out.println("cat");
		}else if (num == 3) {
			System.out.println("chick");
		}else 
			System.out.println("I don't konw");
		
 	}

}
