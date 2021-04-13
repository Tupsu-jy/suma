package teht10;

public abstract class Esimies {

	private Esimies isompiPomo;
	
	public void setIsompiPomo(Esimies isompiPomo) {
		this.isompiPomo=isompiPomo;
	}
	
	public void pyynto(int korotusToive) {
		if(isompiPomo != null) {
			isompiPomo.pyynto(korotusToive);
		}
	}
}
