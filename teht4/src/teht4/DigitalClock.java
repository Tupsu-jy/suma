package teht4;

public class DigitalClock implements ObserverOma {
	private ClockTimer timer;
	public DigitalClock(ClockTimer ct){
		timer = ct;
		timer.attach(this);
	}
	
	@Override
	public void update(Subject s) {
	if (s == timer){
		draw();
		}
	}
	
	private void draw(){
		// tulosta näytölle: System.out.println(…);
		System.out.println(timer.getHour()+":"+timer.getMinute()+":"+timer.getSecond());
	}
}