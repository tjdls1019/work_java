package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] numbers = scanner.nextLine().split(" ");
		
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		int Obesity = num2+100-num1;
		System.out.println(Obesity);
		if (Obesity>0) {
			System.out.println("Obesity");
		}
	}

}
