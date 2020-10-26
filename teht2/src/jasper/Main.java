package jasper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pukeutuja jasper=new Pukeutuja("jasper");
		Tuoteperhe merkki = new Tuoteperhe("boss");
		
		jasper.pue("lippis", merkki.haeVaate("lippis"));
		jasper.pue("farmarit", merkki.haeVaate("farmarit"));
		jasper.pue("paita", merkki.haeVaate("paita"));
		jasper.pue("kengat", merkki.haeVaate("kengat"));
	
		jasper.mitaPaalla();
	}

}
/*

Yksi pukeutuja olio. Normi luokka etc
osaa pukea vaatteita adidakselta

VAATE ON ABSTARKTI TUOTE

LIPPIS FARMARIT ETC ON KONKREETTINE TUOTE
Vaate olio. Näit monta. pitää sisällään vaan nime ja tostringin

tuoteperhe on factory?? <--interface? TÄÄ ON ABSTRACTI TEHDAS

ja sitten sen toteuttaa boss ja adidas  TÄÄ ON KONREETTINEN TEHDAS
niiltä coi pyytää vaatekerran jonka

2.	Abstract Factory: Jasper Java-koodaaja on koko opiskeluaikansa pukeutunut 
Adidas-merkkisiin vaatteisiin lippis ja kengät mukaan lukien. Kirjoita ohjelma, jossa 
Jasper pukee päällensä farmarit, t-paidan, lippiksen ja kengät. Tämän jälkeen Jasper 
luettelee ylpeänä, mitä hänellä on päällään (vaatekappaleet osaavat 
toString-metodeissaan kertoa kaiken oleellisen itsestään).

Valmistuttuaan insinööriksi Jasper siirtyy käyttämään yksinomaan Boss-tuotteita ja osaa 
edelleen kertoa, mitä hänellä on päällään.

Koodaa ohjelma siten, että Jasperiin ei tarvitse tehdä juuri muutoksia Adidas->Boss 
siirtymän takia, vaan ainoa muutos on tuoteperheen (tehtaan) vaihto. 

Bonus: Hyödynnä Java Reflection APIa tehtaan luonnissa. 
Tästä yksi piste lisää, jos palautus ajoissa. Myöhästyneitä palautuksia ei huomioida. 

*/