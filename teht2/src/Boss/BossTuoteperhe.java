package Boss;

import javakoulu.luku14.Farmarit;
import javakoulu.luku14.Kengat;
import javakoulu.luku14.Lippis;
import javakoulu.luku14.Tpaita;
import javakoulu.luku14.Tuoteperhe;

public class BossTuoteperhe implements Tuoteperhe {

	@Override
	public Farmarit createFarmarit() {
		return new BossFarmarit();
	}

	@Override
	public Tpaita createTpaita() {
		return new BossTpaita();
	}

	@Override
	public Lippis createLippis() {
		return new BossLippis();
	}

	@Override
	public Kengat createKengat() {
		return new BossKengat();
	}

}
