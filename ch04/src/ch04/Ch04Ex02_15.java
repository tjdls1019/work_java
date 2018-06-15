package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());

		/*// 증가하는 부분
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 감소하는 부분
		for (int i = 1; i <= num -1; i++) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// 방법 2
		int i = 1;
		boolean isDesc = false;
		while (i != 0) {
		for (int j =1; i <= num * 2 - 1; j++) {
			System.out.print("*");
		}System.out.println();
		
		if ( i == num) {
			isDesc = true;
		}
		
		if (!isDesc) {
			i++;
		}
		else {
			i--;
		}
			
		}
	}
}
