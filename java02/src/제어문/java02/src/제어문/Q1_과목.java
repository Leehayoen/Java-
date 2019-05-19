package 제어문;

import java.util.Scanner;

public class Q1_과목 {

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
		System.out.println("좋아하는 과목은? 선택: 1)파아썬  2)자바  3)c++");
		int like = sc.nextInt();
		if (like == 1) {
			System.out.println("파이썬은 쉽고 강해요");
		}else if (like == 2) {
			System.out.println("자바는 실무에서 쓰여요");
		}else if (like == 3) {
			System.out.println("c++은 정교해요");
		}
		
		
	}

}
