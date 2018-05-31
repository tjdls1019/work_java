package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		int width = num1 +5;
		int length = num2*2;
		int area = width * length;
				
	    System.out.printf(" width = %d%n length = %d%n area = %d", width, length, area);
	}

}
