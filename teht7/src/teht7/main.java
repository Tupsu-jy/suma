package teht7;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarioConnection c = new MarioConnection();
		c.getsHit();
		c.throwFireball();
		c.destroyHardBlock();
		c.getsFlower();
		c.getsMushroom();
		c.destroyHardBlock();
		c.throwFireball();
		c.getsHit();
		c.getsMushroom();
		c.getsFlower();
		c.destroyHardBlock();
		c.throwFireball();
		c.getsHit();
		System.out.println("gg");
	}

}
/*
 7.	State: Määrittele pelihahmo ja sille kolme kehitysastetta. Toteuta eri kehitysasteet
  State-mallin mukaisesti. Pelihahmo voisi olla esim. Pokemon-hahmo Charmander, jonka 
  kaksi muuta kehitysastetta ovat Charmeleon ja Charizard. Määrittele pelihahmolle vähintään
   kolme erilaista toimintoa (metodia) siten, että käyttäytyminen riippuu pelihahmon tilasta.


*/