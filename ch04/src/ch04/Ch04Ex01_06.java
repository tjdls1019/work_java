package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] inputs = scanner.nextLine().split(" ");
		
		String gender = inputs[0];
	    int num1 = Integer.parseInt(inputs[1]);
		
		if (gender.equals("M") && num1 >= 18) {
			System.out.println("MAN");
		}else if (gender.equals("M") && num1 < 18) {
			System.out.println("BOY");
		}else if(gender.equals("F") && num1 >= 18) {
			System.out.println("WOMAN");
		}else if(gender.equals("F") && num1 < 18) {
			System.out.println("GIRL");
	
		
	}

	}}
