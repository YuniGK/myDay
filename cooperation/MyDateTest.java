package cooperation;

import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MyDate myDate = new MyDate();
		
		String yn = "y";
		
		while (true) {
			System.out.println("��¥�� �Է��ϼ���. (��, ��, ��)");
			
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
				
				System.out.printf("[%d�� %d�� %d��]",myYear,myMonth,myDay);
				
			}else {
				System.out.println("�ش� ��¥�� ��ȿ���� �ʽ��ϴ�.");
			}
			
			System.out.println("��� �Ͻðڽ��ϱ�? (y/n)");
			yn = scanner.next();
			
			if(!(yn.equalsIgnoreCase("y"))) {
				break;
			}
			
		}
		
		
	}
	
}
