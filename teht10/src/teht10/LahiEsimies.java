package teht10;

public class LahiEsimies extends Esimies{
	
	public void pyynto(int korotusToive) {
		
		if(korotusToive <= 2) {
			System.out.println("Minä lähiesmiehenäsi hyväksyn tän sun palkankorotuspyynnön kun oot sie vaan niin hyvä roi ukko");
		} else {
			System.out.println("Ai että kun oot ahne. Pitää laittaa eteenpäin tää sun pyyntö");
			super.pyynto(korotusToive);
		}
	}

}
