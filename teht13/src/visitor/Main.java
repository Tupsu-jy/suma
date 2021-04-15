package visitor;

import mario.MarioConnection;

public class Main {

	public static void main(String[] args) {
		MarioConnection small = new MarioConnection();
		MarioConnection superm = new MarioConnection();
		MarioConnection fire = new MarioConnection();
		
		superm.getsMushroom();
		fire.getsMushroom();
		fire.getsFlower();
		
		System.out.println("Smallmario");
		small.accept(new HitBlockVisitor());
		small.accept(new FireballVisitor());

		System.out.println("Supermario");
		superm.accept(new HitBlockVisitor());
		superm.accept(new FireballVisitor());

		System.out.println("Firemario");
		fire.accept(new HitBlockVisitor());
		fire.accept(new FireballVisitor());

	}

}
/*
marioConnection on kontekstiolio mitä käsitellään visitorilla

a) Pohdi voitaisiinko Visitor-mallia käyttää State-mallin kontekstiolioiden käsittelyyn. Kontekstioliot 
olisivat eri pelihahmoja, jotka ovat eri tiloissa. Pelissä haluttaisiin käydä kaikki pelihahmot läpi esim. 
siten että jokaiselle hahmolle annetaan bonuspisteitä. Annettavien bonuspisteiden määrä voi riippua kuitenkin 
hahmosta ja sen tilasta. 

Bonus-visitorissa on metodi kunkin hahmon kutakin tilaa kohden. Esitä tällainen 
bonuspisteiden jakaminen Java-koodina.

Toteutuksesta: Kontekstioliolle sanotaan accept(visitor), joka delegoi pyynnön tilaoliolleen.

elikkä... uusi suunnitelma on että marioita lähetään muokkaamaan 
-otetaan poies ne siirtymät
-jätetään vaan hitblock vaikka


b) Voitaisiinko päätös seuraavasta tilasta ulkoistaa Visitoriin. Tilaolio tai konteksti kutsuisi kunkin 
metodin lopuksi Visitoria (accept-kutsua ei tarvittaisi), joka tekee päätöksen mahdollisesta tilan vaihdosta. 
Esitä Java-koodina.

*/