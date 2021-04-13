package teht10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LahiEsimies le = new LahiEsimies();
		YksikonPaallikko yp = new YksikonPaallikko();
		Toimitusjohtaja tj = new Toimitusjohtaja();
		
		le.setIsompiPomo(yp);
		yp.setIsompiPomo(tj);
		// Press Ctrl+C to end.
		try {
			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("Kerro kuin ahne oot");
				System.out.print(">");
				int korotusToive = scan.nextInt();
				le.pyynto(korotusToive);
			}
		} catch(Exception e) {
			System.exit(1);
		}
	}
}
/*

10.	Chain of Responsibility: Yrityksessä työntekijän lähiesimies pystyy 
hyväksymään  2 % palkankorotuspyynnöt. Pyyntö pitää ohjata yksikön 
päällikölle, jos se ylittää 2 % mutta on alle 5 %. Tätä suuremmat 
palkankorotuspyynnöt ohjataan yrityksen toimitusjohtajalle. Esitä, kuinka 
ratkaiset työntekijän palkankorotuspyynnön käsittelyn Chain of Responsibility –mallilla.

*/