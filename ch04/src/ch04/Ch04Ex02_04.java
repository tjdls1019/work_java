package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		int sum = 0;
		int count = 0;

		while(true) {
			int num = Integer.parseInt(scanner.nextLine());
			count++;
			sum += num; 

			if (num >= 100) {
				break;
			}
		}
		System.out.printf("%d%n%.1f",sum, sum / (double)count);
	}
}



