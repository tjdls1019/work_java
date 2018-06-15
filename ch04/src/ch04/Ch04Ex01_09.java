package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers = scanner.nextLine().split(" ");
		
		int num1= Integer.parseInt(numbers[0]);
		int num2= Integer.parseInt(numbers[1]);
		int num3= Integer.parseInt(numbers[2]);
		

		
		int min1 =(num1<num2) ? num1 : num2;
		int min2 = (min1<num3) ? min1 : num3;
		
		System.out.println(min2);
	}

}
