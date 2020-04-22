package cooperation;

import java.sql.Blob;
import java.util.Calendar;

public class MyDate {
	//필드
	private int year;
	private int month;
	private int day;
	
	Calendar calendar = Calendar.getInstance();
	
	int toYear = calendar.get(Calendar.YEAR);
		
	//set / get
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	//생성자
	public MyDate() {
		this(1988, 12, 19);
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//메서드
	public boolean isValid() {
		int year = getYear(),
			month = getMonth(),
			day = getDay();
		
		boolean tYear, tMonth, tDay = true;
		
		//System.out.println(toYear);
		
		//년
		if(year <= toYear) {
			tYear = true;
		}else {
			tYear = false;
		}
		
		//월
		if(month >= 1 && month <= 12) {
			tMonth = true;
		}else {
			tMonth = false;
		}
		
		//일
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day >= 1 && day <= 31) {
				tDay =true;
			}else {
				tDay =false;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			tDay = (day >= 1 && day <= 30) ? true : false ;
			break;
		case 2:
			if(year % 400 == 0 ||(year % 4 == 0 && year % 100 !=0 )) {
				tDay = (day >= 1 && day <= 29) ? true : false ;
			}else {
				tDay = (day >= 1 && day <= 28) ? true : false ;
			}
			break;
		}
		return (tYear && tMonth && tDay);
	}

}
