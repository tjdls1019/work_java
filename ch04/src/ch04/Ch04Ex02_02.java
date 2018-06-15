package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		int sum = 0;
		int i = 1;

		while(i <= num) {
			sum += i; // sum = sum + i; i가 1씩 증가하면서 sum에 저장
			i++; //i 1씩 증가 


		}
		System.out.println(sum);
	}

}
