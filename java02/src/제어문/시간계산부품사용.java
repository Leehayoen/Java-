package ���;

import java.util.Date;

public class �ð�����ǰ��� {
	//���� �ð��� 10
	//���� ���� 51
	//���� �ʴ� 16
	//���ش� 2019
	//�̹� ���� 5

	public static void main(String[] args) {
		Date date =  new Date();
		
		int hour = date.getHours(); //�ð��� ������.
		System.out.println("���� �ð�" + hour);
		
		int m = date.getMinutes();
		System.out.println("���� �ð�" + hour + "��" + m + "��");
		
		int s = date.getSeconds();
		System.out.println("���� �ð�" + hour + "��" + m + "��" + s + "��");
		
		int year = date.getYear() + 1900;
		System.out.println("���� �ð�" + year + "��" + hour + "��" + m + "��" + s + "��");
		
		int mon = date.getMonth() + 1;
		System.out.println("���� �ð�" + year + "��" + mon+ "��" + + hour + "��" + m + "��" + s + "��");
		
		int day = date.getDate();
		System.out.println("���� �ð�" + year + "��" + mon+ "��" + day + "��" + hour + "��" + m + "��" + s + "��");
	}

}
