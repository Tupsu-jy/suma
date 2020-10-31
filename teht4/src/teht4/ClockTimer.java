package teht4;

import java.util.Date;

public class ClockTimer extends Subject {
	// muuttujat …
	private int hour;
	private int minute;
	private int second;
	
	public ClockTimer() {
		Date date = new Date(); // This object contains the current date value
		hour=date.getHours();
		minute=date.getMinutes();
		second=date.getSeconds();
	}
	
	public int getHour(){
		return hour;
	};
	public int getMinute(){
		return minute;
	};
	public int getSecond(){
		return second;
	};
	void tick(){
		if(second<59) {
			second++;
		}else if(minute<59) {
			second=0;
			minute++;
		}else if(hour<23) {
			hour++;
			second=0;
			minute=0;
		}else {
			hour=0;
			second=0;
			minute=0;
		}
		notify2();
	}
} 