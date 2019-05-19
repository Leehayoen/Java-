package 제어문;

import java.util.Date;

public class 시간계산부품사용 {
	//현재 시각은 10
	//현재 분은 51
	//현재 초는 16
	//올해는 2019
	//이번 달은 5

	public static void main(String[] args) {
		Date date =  new Date();
		
		int hour = date.getHours(); //시각을 구해줌.
		System.out.println("현재 시각" + hour);
		
		int m = date.getMinutes();
		System.out.println("현재 시각" + hour + "시" + m + "분");
		
		int s = date.getSeconds();
		System.out.println("현재 시각" + hour + "시" + m + "분" + s + "초");
		
		int year = date.getYear() + 1900;
		System.out.println("현재 시각" + year + "년" + hour + "시" + m + "분" + s + "초");
		
		int mon = date.getMonth() + 1;
		System.out.println("현재 시각" + year + "년" + mon+ "월" + + hour + "시" + m + "분" + s + "초");
		
		int day = date.getDate();
		System.out.println("현재 시각" + year + "년" + mon+ "월" + day + "일" + hour + "시" + m + "분" + s + "초");
	}

}
