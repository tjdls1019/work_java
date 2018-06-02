package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
		// 1. 한 줄에 두 정수를 입력받아 총 두 줄 입력받기(정수 4개)
		Scanner scanner = new Scanner(System.in);
		//String[] numbers01 =scanner.nextLine().split(" ");	


		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		String input4 = scanner.nextLine();

		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		//String[] numbers02 =scanner.nextLine().split(" ");
		int num3 = Integer.parseInt(input3); 
		int num4 = Integer.parseInt(input4);

		// 조건연산자(삼항연산자) 두번 이용해서 비교하기
		//boolean isGreatesMinsoo = minsooheight > kiyeongheight ? 
	    //(minsooweight> kiyeonweight ? true : false) : false;
		System.out.printf("%b", num1 > num3 && num2 > num4);
	}

}
