package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ2 {

	public static void main(String[] args) {
		//�Է¿���
		//�Է��� ���ִ� ��ǰ ����ؾ���
			Scanner sc = new Scanner(System.in);	//��ĳ�ʴ� �ѹ��� ����
			System.out.print("����� ���̴� ");
			int age = sc.nextInt(); 	//next:�Է¹��� ���� ���� ��Ʈ������ �޾Ƶ��� 		nextInt: ��Ʈ���� ��Ʈ�� ��ȯ�ؼ� ������
			//��� �Է��� ������ Ÿ���� String!!
			//Scanner�� nextInt()�� string->int�� ��ȯ!!
			System.out.println("����� ���̴� "+ age + "�� �ñ���");
			
			//�̸� �Է�, ���
			//sc.next(); //string�Է� �޾Ƽ� java���α׷����� �������ִ� ��ɾ�
			System.out.print("����� �̸��� ");
			String name = sc.next();
			System.out.println("����� �̸��� " + name + "�� ����.");
			
			
			
	}

}
