package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			while(true) {
				
			System.out.print("Base=");
			int B=Integer.parseInt(scanner.nextLine());
			
			System.out.print("Height=");
			int H=Integer.parseInt(scanner.nextLine());
			
			System.out.printf("Triangle area=%.1f%n", B*H/2.0);
			
			System.out.print("Continue?");

			String answer = scanner.nextLine();
			
			if(!answer.equalsIgnoreCase("Y")) {
				
				break;
				
			
			}

		}


	}

}
