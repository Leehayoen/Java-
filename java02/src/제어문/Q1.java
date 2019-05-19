package 제어문;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//1.좋아하는 과목은?
		//		(선택: 1)파아썬 2)자바 3)c++)
		//		-파이썬은 쉽고 강해요.
		//		-자바는 실무에서 쓰여요
		//		-c++은 정교해요
		
		//2.학생의 이름을 입력:홍길동
		//학생의 점수를 입력: 88
		//=> 홍길동의 점수 88점은 B학점입니다.
		//90점 이상이면 A, 80점 이상이면 B,
		//70점 이상이면 C, 60점 이상이면 D,
		//아니면 F학점 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름 입력: ");
		String name = sc.next();
		System.out.print(name+"학생의 점수입력: ");
		int score = sc.nextInt();
		
		if (score <=90) {
			System.out.println(name+"학생의 점수"+score+"는 A");
		}else if (score <= 80) {
			System.out.println(name+"학생의 점수"+score+"는 B");
		}else if (score <= 70) {
			System.out.println(name+"학생의 점수"+score+"는 C");
		}else if (score <= 60) {
			System.out.println(name+"학생의 점수"+score+"는 D");
		}else {
			System.out.println(name+"학생은 F학점");
		}
	}

}
