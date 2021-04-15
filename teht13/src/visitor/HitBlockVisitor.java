package visitor;

import mario.FireMario;
import mario.SmallMario;
import mario.SuperMario;

public class HitBlockVisitor implements MarioVisitor {

	@Override
	public void visit(FireMario fireMario) {
		fireMario.destroyHardBlock();
	}

	@Override
	public void visit(SmallMario smallMario) {
		smallMario.destroyHardBlock();
	}

	@Override
	public void visit(SuperMario superMario) {
		superMario.destroyHardBlock();
	}

}
