package ch02;

public class floatToBinEx {
	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);   //  16 진수로 출력
		System.out.printf("%d%n", i); 
	} 

}
