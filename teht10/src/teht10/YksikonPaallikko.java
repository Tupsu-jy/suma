package teht10;

public class YksikonPaallikko extends Esimies{
	
	public void pyynto(int korotusToive) {
		
		if(korotusToive <= 5) {
			System.out.println("Minä yksikon päällikkonä hyväksyn tän sun palkankorotuspyynnön kun oot sie vaan niin hyvä roi ukko");
		} else {
			System.out.println("Ai että kun oot ahne. Pitää laittaa eteenpäin tää sun pyyntö");
			super.pyynto(korotusToive);
		}
	}

}
