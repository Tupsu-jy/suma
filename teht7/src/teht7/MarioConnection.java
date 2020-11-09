package teht7;

public class MarioConnection {

	private Mario state;
	
	public MarioConnection(){
		state = new SmallMario();
	}
	public void getsHit() {
		state = state.getsHit();
	}
	public void getsMushroom() {
		state = state.getsMushroom();
	};
	public void getsFlower() {
		state = state.getsFlower();
	};
	void destroyHardBlock() {
		state.destroyHardBlock();
	}
	void throwFireball() {
		state.throwFireball();
	}

}
