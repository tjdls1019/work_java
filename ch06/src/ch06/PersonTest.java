package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명(객체 3개) 만들기
		Person a;   a = new Person();
		Person b;   b = new Person();
		Person c;   c = new Person();
		
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		
		a.name = "감";     a.age = 15;      a.address = "서울";
		b.name = "남";     b.age = 17;      b.address = "부천";
		c.name = "담";     c.age = 19;      c.address = "춘천";
		
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		
		a.introduce();
		b.introduce();
		c.introduce();
	}

}
