package mario;

import visitor.MarioVisitor;

public interface Mario {

	Mario getsHit();
	Mario getsMushroom();
	Mario getsFlower();
	void destroyHardBlock();
	void throwFireball();
	void accept(MarioVisitor visitor);
}
