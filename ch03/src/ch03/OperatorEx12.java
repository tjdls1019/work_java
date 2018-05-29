package ch03;

public class OperatorEx12 {
	public static void main(String[] args) {
		char c1 = 'a';       // c1에는 문자 'a'의 코드값인 97이 저장된다.
		char c2 = c1;        // c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 = ' ';       // c3을 공백으로 초기화 한다.
		
		int i = c1 + 1;      // 'a' + 1 -> 97 + 1 -> 98
 		
		c3 = (char) (c1 + 1);    // c1 + 1 -> 97 + 1 -> 98 -> 'b'
		c2++;                    // 98 -> 'b'
		c2++;                    // 99 -> 'c'
		
		System.out.println("i=" + i );    // 98
		System.out.println("c2=" + c2);   // c
		System.out.println("c3=" + c3);   // 'b'
		
		
	}

}
