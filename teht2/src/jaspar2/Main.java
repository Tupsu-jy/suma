package jaspar2;

import Adidas.AdidasTuoteperhe;
import Boss.BossTuoteperhe;
import javakoulu.luku14.Tuoteperhe;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Class;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		Pukeutuja jasper = new Pukeutuja("jasper");

		Class c = null;
		Tuoteperhe t = null;
		
		Properties properties = new Properties();
		try {
		properties.load(
		new FileInputStream("/home/jaakko/koulujuttui/suma/teht2/src/tehdas.properties"));
		} catch (IOException e) {e.printStackTrace();}
		try{
		//luetaan toteuttava tehdas properties-tiedostosta
		c = Class.forName(properties.getProperty("adidas"));
		t = (Tuoteperhe)c.getDeclaredConstructor().newInstance();

		}catch (Exception e){e.printStackTrace();}
		
		jasper.pue(t);
		jasper.mitaPaalla();
		
		System.out.println("jasper valmistuu");
		
		try{
		//luetaan toteuttava tehdas properties-tiedostosta
		c = Class.forName(properties.getProperty("boss"));
		t = (Tuoteperhe)c.getDeclaredConstructor().newInstance();

		}catch (Exception e){e.printStackTrace();}

		
		jasper.pue(t);
		jasper.mitaPaalla();
		
	}

}
/*

04 Class c = null;
05 TehdasIF tehdas = null;
06
07 Properties properties = new Properties();
08 try {
09 properties.load(
10 new FileInputStream("tehdas.properties"));
11 } catch (IOException e) {e.printStackTrace();}
12 try{
13 //luetaan toteuttava tehdas properties-tiedostosta
14 c = Class.forName(properties.getProperty("tehdas"));
15 tehdas = (TehdasIF)c.getDeclaredConstructor().newInstance()
);
16 }catch (Exception e){e.printStackTrace();}
17
18 SankariIF sankari = tehdas.luoSankari();
19 SankaritarIF sankaritar = tehdas.luoSankaritar();
20 sankaritar.pyydaApua();
21 sankari.auta(); 
Bonus: Hyödynnä Java Reflection APIa tehtaan luonnissa. 
Tästä yksi piste lisää, jos palautus ajoissa. Myöhästyneitä palautuksia ei huomioida. 


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