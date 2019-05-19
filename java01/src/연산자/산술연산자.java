package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 한줄 삭제: 컨트록 + D
		// 들여쓰기: tap
		// 자동정리: 컨트록 +쉬프트+f
		int x = 5;
		int y = 3;
		System.out.println(x + y);
		
		int z = x  + y;
		System.out.println("두 수의 합은 " + z);
		System.out.println(x + "+" + y + "=" + z);
		System.out.println(x + "+" + y + "=" + z);
		
		System.out.println(x + "+" + y + "=" + x + y);	//결과값: 200100
		System.out.println(x + "+" + y + "=" + (x + y));//결과값: 300
		System.out.println(x + "-" + y + "=" + (x - y));
		System.out.println(x + "*" + y + "=" + (x * y));
		System.out.println(x + "/" + y + "=" + (x / y));
		System.out.println(x + "%" + y + "=" + (x % y)); //나머지
		//줄 전체 복사컨트롤 + 알트+ 화살표 아래
		//이동: 알트 + 화살표방향
	}

}
