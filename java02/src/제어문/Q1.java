package ���;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//1.�����ϴ� ������?
		//		(����: 1)�ľƽ� 2)�ڹ� 3)c++)
		//		-���̽��� ���� ���ؿ�.
		//		-�ڹٴ� �ǹ����� ������
		//		-c++�� �����ؿ�
		
		//2.�л��� �̸��� �Է�:ȫ�浿
		//�л��� ������ �Է�: 88
		//=> ȫ�浿�� ���� 88���� B�����Դϴ�.
		//90�� �̻��̸� A, 80�� �̻��̸� B,
		//70�� �̻��̸� C, 60�� �̻��̸� D,
		//�ƴϸ� F���� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��̸� �Է�: ");
		String name = sc.next();
		System.out.print(name+"�л��� �����Է�: ");
		int score = sc.nextInt();
		
		if (score <=90) {
			System.out.println(name+"�л��� ����"+score+"�� A");
		}else if (score <= 80) {
			System.out.println(name+"�л��� ����"+score+"�� B");
		}else if (score <= 70) {
			System.out.println(name+"�л��� ����"+score+"�� C");
		}else if (score <= 60) {
			System.out.println(name+"�л��� ����"+score+"�� D");
		}else {
			System.out.println(name+"�л��� F����");
		}
	}

}
