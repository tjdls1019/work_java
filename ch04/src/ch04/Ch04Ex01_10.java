package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);

		String numbers[] = scanner.nextLine().split(" ");

		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);

		if (num1 > num2) {
			System.out.println(num1 - num2);
		}else if (num1 < num2) {
			System.out.println(num2 - num1);
		}
		//번외 : 메소드 이용해서 구하는 방법
		System.out.println(Math.abs(num1 -num2));


	}

}
