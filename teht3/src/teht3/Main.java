package teht3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laiteosa kot=new Kotelo();
		Laiteosa asd2=new Emolevy();
		asd2.addLaiteosa(new Muistipiiri());
		asd2.addLaiteosa(new Prosessori());
		asd2.addLaiteosa(new Näytönohjain());
		
		kot.addLaiteosa(asd2);
		
		System.out.println("hinta on "+kot.getPrice());
		
	}

}

/*
3.	Composite: Suunnittele Composite-mallin mukaisesti rajapinnat ja toteutukset systeemille, 
jolla voit esittää pöytätietokoneen kokoonpanon ja laskea sen hinnan, kun kukin komponentti 
tietää oman hintansa.

Idea on että tietokoneen kaikki osat ovat vaikkapa Laiteosa-rajapinnan toteuttajia. Laiteosalla on hinta.

Laiteosia on erilaisia, esim:
- muistipiiri
- emolevy
- prosessori
- verkkokortti
- näytönohjain
- kotelo

Näistä ainakin emolevy ja kotelo ovat koostekomponentteja. Näiden hinta muodostuu komponentin omasta 
hinnasta sekä mahdollisen sisällön eli liitettyjen komponenttien hinnasta.

Esitä luokkahierarkia ja rakenna pöytätietokonekokoonpano haluamistasi osista ja laske lopuksi kokoonpanon 
hinta ja tulosta se. Hinnan ilmoittava metodi palauttaa hinnan metodin paluuarvona.

Hyvän mielen bonus:

Esitä, kuinka voit luoda kaikki tuoteosat abstraktin tehtaan avulla.
Esitä myös, kuinka konkreettista tehdasta vaihtamalla saat helposti lasketuksi eri tehtaiden tuottamien 
samanlaisten kokoonpanojen hintoja.


*/