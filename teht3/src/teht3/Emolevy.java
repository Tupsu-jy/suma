package teht3;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa{

	private List<Laiteosa> osaList = new ArrayList<Laiteosa>();
	private int price=25;
	
	public void addLaiteosa(Laiteosa laiteosa) {
		osaList.add(laiteosa);
	}

	public int getPrice() {
	
		int asd=price;
		for (Laiteosa laiteosa : osaList) {
			asd+=laiteosa.getPrice();
		}
		return asd;
	}

}
