package 제어문;

import java.util.Scanner;

public class 입력테스트4 {

	public static void main(String[] args) {
		System.out.println("저기요!!!");
		System.out.println("--------------------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("--------------------------------");
		System.out.println("1)짜장면, 2)잠뽕, 3)우동");
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 선택은?");
		int food = sc.nextInt();
		
		if (food == 1) {
			System.out.println("당신은 짜장면을 주문하셨습니다.");
		} else if(food == 2){
			System.out.println("짬뽕을 선택하셨군요");
		} else if (food == 3) {
			System.out.println("우동을 선택하셨군요");
			
		}
			
	}

}
