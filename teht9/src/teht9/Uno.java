package teht9;

import java.util.Iterator;
import java.util.List;
//1. strategia kirjoittaa rivinvaihtomerkin jokaisen alkion jälkeen
//iteraattorin käyttö
public class Uno implements ListConverter{

	@Override
	public String toString(List<String> list) {
		String re="";
		Iterator<String> asd=list.iterator();
		while(asd.hasNext()) {
			re+=asd.next()+"\n";
		}
		return re;
	}

}
