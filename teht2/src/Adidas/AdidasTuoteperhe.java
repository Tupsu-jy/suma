package Adidas;

import javakoulu.luku14.Farmarit;
import javakoulu.luku14.Kengat;
import javakoulu.luku14.Lippis;
import javakoulu.luku14.Tpaita;
import javakoulu.luku14.Tuoteperhe;

public class AdidasTuoteperhe implements Tuoteperhe {

	@Override
	public Farmarit createFarmarit() {
		return new AdidasFarmarit();
	}

	@Override
	public Tpaita createTpaita() {
		return new AdidasTpaita();
	}

	@Override
	public Lippis createLippis() {
		return new AdidasLippis();
	}

	@Override
	public Kengat createKengat() {
		return new AdidasKengat();
	}

}
