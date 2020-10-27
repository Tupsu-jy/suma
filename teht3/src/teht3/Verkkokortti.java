/**
 * 
 */
package teht3;

/**
 * @author yline
 *
 */
public class Verkkokortti implements Laiteosa{

	private int price=15;
	
	public void addLaiteosa(Laiteosa laiteosa) {
		throw new RuntimeException
		("Cant new parts to this");
	}

	public int getPrice() {
		return price;
	}

	
}
