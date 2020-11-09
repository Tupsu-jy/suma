package teht9;

import java.util.List;
//- lista taulukoksi ennen läpikäyntiä, joka toteutetaan for-silmukassa
//2. strategia tulostaa rivinvaihtomerkin joka toisen alkion jälkeen
public class Dos implements ListConverter{

	@Override
	public String toString(List<String> list) {
		String re="";
		String[] asd = new String[list.size()];
		asd=list.toArray(asd);
		for (int i = 0; i < asd.length; i++) {
			re+=asd[i]+" ";
			if((i+1) % 2 == 0)
				re+="\n";
		}
		return re;
	}
}
