package teht9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();

		list.add("Olipa");
		list.add("kerran");
		list.add("muumipeikko");
		list.add("joka");
		list.add("hyppelehti");
		list.add("alasti");
		list.add("ympäriinsä");
		list.add("ja");
		list.add("se");
		list.add("ihan");
		list.add("ok");
		list.add("koska");
		list.add("muumipeikko");
		list.add("oli");
		list.add("virtahepo.");
		list.add("Nuuskamuikkonen");
		list.add("oli");
		list.add("säädyllinen");
		list.add("ja");
		list.add("ihminen");
		list.add("ja");
		list.add("silleen");
		
		ListConverter qwe = new Uno();
		System.out.println(qwe.toString(list));
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		qwe = new Dos();
		System.out.println(qwe.toString(list));
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		qwe = new Tres();
		System.out.println(qwe.toString(list));
		
	}

}
/*
interafce luokka ListConverter on tässä
sen implementoi 3 eri 
strategia luokkaa

maini on asiakas joka käyttää niitä

9.	Strategy:  tee a) tai b).

a) Määrittele  Strategy-mallin mukaisesti ListConverter-rajapinta, jossa määritellään
 listToString-metodi, joka saa parametrikseen List-tietorakenteen ja palauttaa listan 
 merkkijonona, jossa 

1. strategia kirjoittaa rivinvaihtomerkin jokaisen alkion jälkeen
2. strategia tulostaa rivinvaihtomerkin joka toisen alkion jälkeen
3. strategia tulostaa rivinvaihtomerkin joka kolmannen alkion jälkeen

Toteuta eri strategioissa listan läpikäynti eri tavoin. 
Eri tapoja:
- iteraattorin käyttö 
- lista taulukoksi ennen läpikäyntiä, joka toteutetaan for-silmukassa
- listan läpikäynti for-silmukassa käyttäen List-rajapinnan get-metodia.

Testiohjelmassa luodaan lista ja tulostetaan eri strategioilla aikaansaatu lopputulos. 

b) Toteuta vähintään kolme erilaista taulukon lajittelualgoritmia (lähdekoodeja esim. 
https://java2novice.com/java-sorting-algorithms/. Esitä sovellus, jossa lajittelualgoritmin 
valinta toteutetaan Strategy-mallin mukaisesti. Generoi tarpeeksi suuri lajiteltava aineisto 
ja mittaa lajitteluun kuluvat ajat. 
*/