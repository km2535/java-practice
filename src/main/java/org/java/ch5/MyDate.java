package org.java.ch5;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class MyDate {
	int day;
	int month;
	int year;
	LocalDateTime dateTime;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String isValid(){
		try{
			dateTime = LocalDateTime.of(year, month, day, 0, 0);
			return "유효한 날짜입니다.";
		}catch (DateTimeException e){
			return "유효하지 않은 날짜입니다.";
		}
	}

}
