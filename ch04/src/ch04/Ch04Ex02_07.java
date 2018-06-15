package ch04;

import java.util.Scanner;

public class Ch04Ex02_07 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int num = Integer.parseInt(Scanner.nextLine());
		
		
		for(int i = num-1; i >= 0; i--)
		System.out.print(num-i);

	}

}
