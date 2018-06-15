package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		double avg = 0;

		
		while(true) {
			int num = Integer.parseInt(scanner.nextLine());
			
			
			if(num>100) {
				System.out.printf("sum:%d%n", sum);
				System.out.printf("avg:%.1f", (double)sum/count);
				sum += num; count++; 
				break;
			}else if(num<=100) {
				sum += num; count++; 
			}
			
				
				
			}
		}
	}


