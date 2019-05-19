package Á¦¾î¹®;

import java.util.Scanner;

public class Q3_»çÄ¢¿¬»ê {

	public static void main(String[] args) {
		System.out.println("=====================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ıÀÚ 1: ");
		int num1 = sc.nextInt();
		System.out.print("¼ıÀÚ 2: ");
		int num2 = sc.nextInt();
		//System.out.println("¼±ÅÃ 1)+ 2)- 3)* 4)/");
		//int Operator = sc.nextInt();
		System.out.print("¿¬»êÀÚ ÀÔ·Â: ");
		String oper = sc.next(); //"+"
		char op = oper.charAt(0); //'+'		//°ıÈ£ ¾È À§Ä¡
		System.out.println("=====================================");
		
		switch(op){
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
		}
		
		//int sum = num1 + num2;
		//int sub = num1 - num2;
		//int mul = num1 * num2;
		//int div = num1 / num2;
		//
		//System.out.println("µ¡¼À : " + sum);
		//System.out.println("»¬¼À : " + sub);
		//System.out.println("°ö¼À : " + mul);
		//System.out.println("³ª´°¼À : " + div);
		
		//if (Operator == 1) {
		//	System.out.println(num1 + num2);
		//}else if (Operator == 2) {
		//	System.out.println(num1 - num2);
		//}else if (Operator == 3) {
		//	System.out.println(num1 * num2);
		//}else if (Operator == 4) {
		//	System.out.println(num1 / num2);
		//}
		
	}

}
