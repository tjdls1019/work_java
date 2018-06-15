package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	

		int odd = 0;
		int even = 0;
	

		while(true) {
			int num = Integer.parseInt(scanner.nextLine());
			
			if  (num == 0) {
				System.out.printf("odd:%d%n", odd);
				System.out.printf("even:%d", even);
				break;
				
			}else if (num % 2 != 0) {
				odd++;
				
			}else if (num % 2 == 0) {
				even++;
			}

		}
	}


}
