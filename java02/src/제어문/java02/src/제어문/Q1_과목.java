package ���;

import java.util.Scanner;

public class Q1_���� {

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
		System.out.println("�����ϴ� ������? ����: 1)�ľƽ�  2)�ڹ�  3)c++");
		int like = sc.nextInt();
		if (like == 1) {
			System.out.println("���̽��� ���� ���ؿ�");
		}else if (like == 2) {
			System.out.println("�ڹٴ� �ǹ����� ������");
		}else if (like == 3) {
			System.out.println("c++�� �����ؿ�");
		}
		
		
	}

}
