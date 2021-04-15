package visitor;

import mario.FireMario;
import mario.SmallMario;
import mario.SuperMario;

public interface MarioVisitor {

	void visit(FireMario fireMario);
	void visit(SmallMario smallMario);
	void visit(SuperMario superMario);
}
