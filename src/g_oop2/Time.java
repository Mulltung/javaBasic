package g_oop2;


public class Time {
   
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0) {
			this.hour = 0;
		} else
			this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0) {
			this.minute = 0;
		} else
			this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0) {
			this.second = 0;
		} else
			this.second = second;
	}

	String getTime() {
		return hour + ":" + minute + ":" + second;
	}
	
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second + 1 );
		}
	}
	
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}
}
