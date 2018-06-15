package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("정수를 입력하세요.(0:종료)>");
			int num = Integer.parseInt(scanner.nextLine());
			
			if(num==0) {
				System.out.println();
				break;
			}else if (num > 0) {
				System.out.println("positive integer");
			}else if (num < 0) {
				System.out.println("negative number");
			}
		}
	}

}
