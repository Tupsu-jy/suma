package teht7;

public class FireMario implements Mario {
	
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
		System.out.println("WOOSH!! Fireball away!!");
	}

	@Override
	public Mario getsMushroom() {
		return new FireMario();
	}

	@Override
	public Mario getsFlower() {
		return new FireMario();
	}
}
