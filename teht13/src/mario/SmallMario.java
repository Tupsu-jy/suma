package mario;

import visitor.MarioVisitor;

public class SmallMario implements Mario {

	@Override
	public Mario getsHit() {
		System.out.println("GAME OVER. Starting new game.");
		return new SmallMario();
	}

	@Override
	public void destroyHardBlock() {
		System.out.println("No can do :(");
	}

	@Override
	public void throwFireball() {
		System.out.println("No can do :(");
	}

	@Override
	public Mario getsMushroom() {
		return new SuperMario();
	}

	@Override
	public Mario getsFlower() {
		return new SmallMario();
	}

	@Override
	public void accept(MarioVisitor visitor) {
		visitor.visit(this);
	}

}
