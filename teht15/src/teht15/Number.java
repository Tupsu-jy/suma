package teht15;

public class Number implements NumberInt {

	private int num;
	
	public Number(int start) {
		num=start;
	}
	
	@Override
	public int getInt() {
		return num;
	}

	@Override
	public void addOne() {
		num=num+1;
	}

}
