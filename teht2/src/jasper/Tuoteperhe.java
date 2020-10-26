package jasper;

public class Tuoteperhe {

	String merkki;
	
	public Tuoteperhe (String merkki) {
		this.merkki=merkki;
	}
	
	public Vaate haeVaate(String vaateKat) {
		Vaate palautettava=null;
		switch(vaateKat) {
			case "kengat":
				palautettava = new Kengat(merkki);
				break;
			case "paita":
				palautettava = new Paita(merkki);
				break;
			case "farmarit":
				palautettava = new Farmarit(merkki);
				break;
			case "lippis":
				palautettava = new Lippis(merkki);
				break;
		}
		
		return palautettava;
	}
}
