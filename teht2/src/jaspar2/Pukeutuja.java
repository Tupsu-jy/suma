package jaspar2;

import javakoulu.luku14.Farmarit;
import javakoulu.luku14.Kengat;
import javakoulu.luku14.Lippis;
import javakoulu.luku14.Tpaita;
import javakoulu.luku14.Tuoteperhe;

public class Pukeutuja {

	private String nimi;

	private Farmarit farmari;
	private Kengat kengat;
	private Lippis lippis;
	private Tpaita paita;
	
	
	public Pukeutuja(String nimi) {
		this.nimi=nimi;
	}
	
	public void pue(Tuoteperhe t) {
		farmari=t.createFarmarit();
		kengat=t.createKengat();
		lippis=t.createLippis();
		paita=t.createTpaita();
	}
	
	public void mitaPaalla() {
		System.out.println("Nimeni on "+nimi+" ja päälläni on");
		System.out.println(farmari+", "+kengat+", "+lippis+", "+paita+" ");
		System.out.println("olen ylpeä kaikista vaatesitani");
	}
	
}
