package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] numbers = scanner.nextLine().split(" ");

		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);

		// 첫번째 수가 작고 두번째 수가 클 경우
		if (num1 < num2) {
			for(int i = 1; i <= 9; i++) {
				for(int j = num1; j <= num2; j++) {
					System.out.printf("%d * %d = %3d   ", j, i, j*i);
				}
				System.out.println();
			}
				// 첫번째 수가 크고 두번째 수가 작은 경우
			}else if (num2 < num1) {
				for(int i = 1; i <= 9; i++) {
					for(int j = num1; j >= num2; j--) {
						System.out.printf("%d * %d = %3d   ", j, i, j*i);
					}
					System.out.println();
				}
			}
		}

	}


