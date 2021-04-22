package teht15;

public class Main {

	public static void main(String[] args) {
		NumberInt asd = new Number(2);

		NumberAdapter qwe = new NumberApadterImpl(asd);
		
		for (int i = 0; i < 10; i++) {
			qwe.addItself();
			System.out.println(qwe.getInt());
		}
		
	}

}
/*
Mitä tahdotaan: kertoa luku itsellään
Mitä luokka tekee: lisää ++ itseensä
Adapteri for loopilla tai jollain tekee ++ kunnes on kerrottu itsellään

Adapter: Adapter-ratkaisu mahdollistaa olemassa olevan ohjelmamoduulin (esim. luokka) käyttämisen vaikka 
sen rajapinta olisi erilainen, kuin mitä asiakas haluaa käyttää. Mieti itse tätä havainnollistava esimerkki
ja toteuta ohjelma, jossa esität, kuinka adapterin avulla olemassa oleva luokka palveluineen voidaan ottaa
käyttöön muuttamatta tätä millään tavalla.
*/