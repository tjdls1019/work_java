package ch02;

public class FloatEx1 {
	public static void main(String[] args) {
		float f     = 9.12345678901234567890f;   // 소수점 20자리
		float f2    = 1.2345678901234567890f;    // 소수점 19자리
		double d    = 9.12345678901234567890d;   // 소수점 20자리
		
		System.out.printf("       123456789012345678901234%n");
		System.out.printf("f  :   %f%n", f);  // 소수점 이하 6째짜리까지 출력.
		System.out.printf("f  : %24.20f%n", f);
		System.out.printf("f2 : %24.20f%n", f2);
		System.out.printf("d  : %24.20f%n", d);
		
	}

}
