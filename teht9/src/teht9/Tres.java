package teht9;

import java.util.List;

//3. strategia tulostaa rivinvaihtomerkin joka kolmannen alkion jälkeen
//- listan läpikäynti for-silmukassa käyttäen List-rajapinnan get-metodia.


public class Tres implements ListConverter{

	@Override
	public String toString(List<String> list) {
		String re="";
		
		for (int i = 0; i < list.size(); i++) {
			re+=list.get(i)+" ";
			if((i+1) % 3 == 0)
				re+="\n";
		}
		return re;
	}
}
