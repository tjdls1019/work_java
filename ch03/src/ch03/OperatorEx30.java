package ch03;

/*
 * 127쪽 간추려서 작성
 * 
 * 코드 자동 정렬법
 * 1. Ctrl + A 눌러 정렬할 범위 지정(전체범위)
 * 2. Ctrl + I 눌러 지정한 범위의 코드 자동정렬
 */
public class OperatorEx30 {
	public static void main(String[] args) {
		int dec = 8;

		// 비트를 오른쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 0));

		// 비트를 오른쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 1));

		// 비트를 오른쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 2));

		// 비트를 왼쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 0));

		// 비트를 왼쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 1));

		// 비트를 왼쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 2));

		dec = -8;

		// 비트를 오른쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 0));

		// 비트를 오른쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 1));

		// 비트를 오른쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 2));

		// 비트를 왼쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 0));

		// 비트를 왼쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 1));

		// 비트를 왼쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 2));
	}

	// 10진 정수를 2진수로 변환하는 메소드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";  //32비트(32개)
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length() - 32);
	}

}
