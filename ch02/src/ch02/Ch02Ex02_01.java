package ch02;
import java.util.*;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		//1. 입력받기 위해 스캐너 객체 생성, System.in은 키보드
		Scanner scanner = new Scanner(System.in);
		// 2. scanner를 이용하여 성적 입력받기 ( 세번 입력)
		System.out.print("두자리 정수를 하나 입력해 주세요.>");
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
	    int num = Integer.parseInt(input);
	    int num2 = Integer.parseInt(input2);
	    int num3 = Integer.parseInt(input3);
	    
	    int sum = num + num2 + num3;
	    int avg = (num + num2 + num3)/3;
	    
	    System.out.printf("%s", "kor");
	    System.out.printf("%d%n", num);
	    System.out.printf("%s ", "mat");
	    System.out.printf("%d%n", num2);
	    System.out.printf("%s ", "eng");
	    System.out.printf("%d%n", num3);
	    System.out.printf("%s ", "sum");
	    System.out.printf("%d%n", num + num2 + num3);
	    System.out.printf("%s ", "avg");
	    System.out.printf("%d%n", (num + num2 + num3)/3);
	    
	    
	    //String strKor = scanner.nextLine();
	    //String strMAt = scanner.nextLine();
	    //String strEng = scanner.nextLine();
	    
	    //3. 문자열로 입력받은 성적을 정수(int)형으로 변경
	    //int kor = Integer.parseInt(strKor);
	    //int mat = Integer.parseInt(strMat);
	    //int eng = Integer.parseInt(strEng);
	    
	    //4. 합계와 평균을 구하기
	    //int sum = kor + mat + eng;
	    //int avg= sum / 3;
	    
	    //5. printf()를 이용하여 출력
	    //System.out.printf("Kor %d%n", kor);
	    //System.out.printf("Mat %d%n", mat);
	    //System.out.printf("Eng %d%n", eng);
	    //System.out.printf("Sum %d%n", sum);
	    //System.out.printf("Avg %d%n", avg);
	  
	    
	    
	    
	    
	   

	    
	    
	   
	    
	   
	  
	    
	  
	
	    
	}
}