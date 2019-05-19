package Á¦¾î¹®;

import java.util.Scanner;

public class ÀÔ·ÂÅ×½ºÆ®5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Áö±İ ½Ã°¢Àº?");
		int time = sc.nextInt();
		
		if (time <= 10) {
			System.out.println("±Â¸ğ´×");
		} else if(time <= 14){
			System.out.println("±Â¿¡ÇÁÅÍ´«");
		} else if (time <= 20) {
			System.out.println("±ÂÀÌºê´×");
		} else {
			System.out.println("±Â³ªÀÕ");
		}
			
	}

}
