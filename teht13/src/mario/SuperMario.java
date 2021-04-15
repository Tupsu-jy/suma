package mario;

import visitor.MarioVisitor;

public class SuperMario implements Mario {

	@Override
	public Mario getsHit() {
		return new SmallMario();
	}

	@Override
	public void destroyHardBlock() {
		System.out.println("BAM!! Block destroyed");
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
		return new FireMario();
	}
	
	@Override
	public void accept(MarioVisitor visitor) {
		visitor.visit(this);
	}

}
