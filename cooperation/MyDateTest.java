package cooperation;

import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MyDate myDate = new MyDate();
		
		String yn = "y";
		
		while (true) {
			System.out.println("날짜를 입력하세요. (년, 월, 일)");
			
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			
			myDate.setYear(year);
			myDate.setMonth(month);
			myDate.setDay(day);
			
			boolean isValid = myDate.isValid();
			
			if(isValid) {
				int myYear = myDate.getYear();
				int myMonth = myDate.getMonth();
				int myDay = myDate.getDay();
				
				System.out.printf("[%d년 %d월 %d일]",myYear,myMonth,myDay);
				
			}else {
				System.out.println("해당 날짜는 유효하지 않습니다.");
			}
			
			System.out.println("계속 하시겠습니까? (y/n)");
			yn = scanner.next();
			
			if(!(yn.equalsIgnoreCase("y"))) {
				break;
			}
			
		}
		
		
	}
	
}
