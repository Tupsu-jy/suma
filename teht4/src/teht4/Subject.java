package teht4;

import java.util.HashSet;
import java.util.Observer;
import java.util.Set;

public abstract class Subject {
	Set<ObserverOma> observers = new HashSet();
	public void attach(ObserverOma o){
		observers.add(o);
	}
	public void detach(ObserverOma o) {
		observers.remove(o);
	}
	
	protected void notify2(){
		for (ObserverOma o: observers){
			o.update(this);
		}
	}
}