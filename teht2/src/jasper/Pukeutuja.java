package jasper;

import java.util.HashMap;

public class Pukeutuja {

	private String nimi;
	private HashMap<String, Vaate> vaatteet;
	
//	private String farmari;
//	private String lippis;
//	private String paita;
//	private String kengät;
	
	
	public Pukeutuja(String nimi) {
		this.nimi=nimi;
		this.vaatteet=new HashMap<String, Vaate>();
	}
	
	public void pue(String vaateKat, Vaate jtn) {
		vaatteet.put(vaateKat, jtn);
	}
	
	public void mitaPaalla() {
		System.out.println("Nimeni on "+nimi+" ja päälläni on");
		vaatteet.entrySet().forEach(vaate -> {
			
		    System.out.println(vaate.getValue().toString());
		  });
		System.out.println("olen ylpeä kaikista vaatesitani");
	}
	
}
