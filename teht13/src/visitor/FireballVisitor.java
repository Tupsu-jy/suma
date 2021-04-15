package visitor;

import mario.FireMario;
import mario.SmallMario;
import mario.SuperMario;

public class FireballVisitor implements MarioVisitor {

	@Override
	public void visit(FireMario fireMario) {
		fireMario.throwFireball();
	}

	@Override
	public void visit(SmallMario smallMario) {
		smallMario.throwFireball();
	}

	@Override
	public void visit(SuperMario superMario) {
		superMario.throwFireball();
	}

}
