package teht6;

public class main {

	public static void main(String[] args) {
		DataStack asd=new SimpleDataStack();
		asd.add(5);
		asd.add(2);
		asd.add(45);
		System.out.println(asd.get());
		ProtectedDataStack qwe=new ProtectedDataStack(asd);
		qwe.add(12);
		System.out.println(qwe.get());
		System.out.println(qwe.get());
	}

}

/*
 * a) Toteuta data-rakenne ja sen käsittely joko pääsynvalvonnalla tai ilman pääsynvalvontaa. 
 * Pääsynvalvonta dekoraattorilla.

window inteface luokka=lisää pinoon ja poista pinosta inteface

simpleWindow = lisää pinoon ja poista pinosta totetutus



b) Toteuta datan kirjoittaminen/lukeminen levylle/levyltä joko salakirjoitettuna tai ilman. 
Salakirjoitus ja purku dekoraattorilla.

c) Pizzaravintola laatii pizzahinnaston decorator-mallin avulla. 
Pizza koostuu pohjasta ja erilaisista täytteistä. Pohjalla ja täytteillä on kullakin omat hinnat.  
Tee ohjelma, jossa rakennat kolme mieleistäsi pizzaa ja tulostat pizzamenun hintoineen. 
Pizzapohja ja kaikki täytteet toteuttavat Pizza-rajapintaa. Kaikki täytteet ovat dekoraattoreita. 
Piirrä myös luokkakaavio.
 * 
 */