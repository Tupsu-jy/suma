package teht15;

public class NumberApadterImpl implements NumberAdapter {

	private NumberInt num;
	
	public NumberApadterImpl(NumberInt num) {
		this.num=num;
	}
	
	@Override
	public int getInt() {
		return num.getInt();
	}

	@Override
	public void addItself() {
		
		int val = num.getInt();
		for (int i = 0; i < val; i++) {
			num.addOne();
		}
	}

}
