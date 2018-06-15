package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			int num = Integer.parseInt(scanner.nextLine());
			int a = num/3;
			
			if(num == -1) {
				System.out.println();
				break;
			}else if (num % 3 == 0) {
				System.out.println(a);
			}else {
				
			}
		}
	}

}
