package java01;

public class Me {

	public static void main(String[] args) {
		//������ ����� ����.
		//���� �����ݷ� ���
		int age = 100;	//���� ����
		
		byte count = 127; //127������ �����Ҽ����� ( -128~ 127)
		short count2 = 30000; // -3�� ~ 3��
		
		int last = age - 1;	//�۳� ����
		
		long count3 = 316546123546L; //���ڶ�� �ž˷��ֱ����� L �ٿ�����
		
		float eye2 = 0.9f;	//double�� �����ϱ����� f�� �ٿ���
		double eye = 0.5;	//double �Ҽ��� 16�ڸ����� ��������	//float�� �Ҽ��� 8�ڸ�����
		char gender = '��'; //�ѱ��ڴ� �̱���Ʈ
		boolean food = false; //�ڹٴ� ���ڷ� �Ҽ����� 0 -> false ó�� ���� ����!
		String name = "����";
		//�⺻���� �ƴ� �����ʹ� ������ �빮�ڷ� ������ ���ڿ�(String)�� �⺻���� �ƴ�
		
		System.out.println("�� �̸��� " + name);
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�۳� ���̴� " + last + "�� �����ϴ�.");
		System.out.println("�� �÷��� " + eye);
		System.out.println("�� ������ " + gender);
		System.out.println("��ħ�� �Ծ�����??" + food);

	}

}
