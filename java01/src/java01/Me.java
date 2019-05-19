package java01;

public class Me {

	public static void main(String[] args) {
		//변수를 만들어 보자.
		//끝에 세미콜론 찍기
		int age = 100;	//올해 나이
		
		byte count = 127; //127까지만 저장할수있음 ( -128~ 127)
		short count2 = 30000; // -3만 ~ 3만
		
		int last = age - 1;	//작년 나이
		
		long count3 = 316546123546L; //숫자라는 거알려주기위해 L 붙여야함
		
		float eye2 = 0.9f;	//double와 구분하기위해 f를 붙여줌
		double eye = 0.5;	//double 소수점 16자리까지 쓸수있음	//float는 소수점 8자리까지
		char gender = '여'; //한글자는 싱글코트
		boolean food = false; //자바는 숫자로 할수없음 0 -> false 처럼 쓸수 없음!
		String name = "수박";
		//기본형이 아닌 데이터는 무조건 대문자로 시작함 문자열(String)도 기본형이 아님
		
		System.out.println("내 이름은 " + name);
		System.out.println("내 나이는 " + age + "세 입니다.");
		System.out.println("작년 나이는 " + last + "세 였습니다.");
		System.out.println("내 시력은 " + eye);
		System.out.println("내 성별은 " + gender);
		System.out.println("아침을 먹었나요??" + food);

	}

}
