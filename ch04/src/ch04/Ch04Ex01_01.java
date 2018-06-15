package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = Integer.parseInt(scanner.nextLine());
	
		
		
		if (num1<0) {
			System.out.println(num1);
			System.out.println("minus");
		}else if (num1 > 0) {
			System.out.println(num1);
		}
	
}
}