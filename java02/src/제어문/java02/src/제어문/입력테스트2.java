package 제어문;

import java.util.Scanner;

public class 입력테스트2 {

	public static void main(String[] args) {
		//입력연습
		//입력할 수있는 부품 사용해야함
			Scanner sc = new Scanner(System.in);	//스캐너는 한번만 복사
			System.out.print("당신의 나이는 ");
			int age = sc.nextInt(); 	//next:입력받은 것을 전부 스트링으로 받아들임 		nextInt: 스트링을 인트로 변환해서 가져옴
			//모든 입력의 데이터 타입은 String!!
			//Scanner의 nextInt()는 string->int로 변환!!
			System.out.println("당신의 나이는 "+ age + "세 시군요");
			
			//이름 입력, 출력
			//sc.next(); //string입력 받아서 java프로그램으로 가져다주는 명령어
			System.out.print("당신의 이름은 ");
			String name = sc.next();
			System.out.println("당신의 이름은 " + name + "시 군요.");
			
			
			
	}

}
