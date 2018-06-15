package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			int num = Integer.parseInt(scanner.nextLine());
			
			if (num ==0) {
				System.out.println(count);
			}else if (num % 3 !=0 && num %5 != 0) {
				count++;
			}
		}
	}

}
