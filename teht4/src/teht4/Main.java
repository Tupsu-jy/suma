package teht4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockTimer asd = new ClockTimer(); 
		DigitalClock qwe = new DigitalClock(asd);

		asd.attach(qwe);
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			asd.tick();
		}
		
	}

}

/*
4.	Observer: Toteuta luentomateriaalissa (Observer.pdf) Observer-mallin sovelluksena 
esitetty hahmotelma digitaalisesta kellosta Javalla täydentäen koodia puuttuvin osin. 
Käytä ratkaisussasi Javan APIsta löytyviä Observer-rajapintaa ja Observable-luokkaa. 
Jos haluat käyttää jotain muuta Javan tekniikkaa, koska Observer/Observable on deprecated 
Java 9:stä alkaen, se on ok. Vaikka Javan Observer/Observable-mekanismi on deprecated,
 sitä ei poisteta Javasta, mutta sen kehitystä ei jatketa. Sen käytölle on esitetty 
 vaihtoehtoisia tapoja. 
*/