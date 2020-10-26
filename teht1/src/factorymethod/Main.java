package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus muumo = new Muumi();
        AterioivaOtus herhiläinen = new Tappjaisherhiläinen();
        opettaja.aterioi();
        muumo.aterioi();
        herhiläinen.aterioi();
    }
}

/*
Factory Method: Liitteenä on factorymethod.zip, joka sisältää koodia, jossa AterioivaOtus 
aterioi. Esimerkkiohjelman Juoma luodaan AterioivanOtuksen Opettaja-aliluokassa. 
Juomanluontimetodi on tehdasmetodi. Kirjoita Opettaja-luokalle kaksi rinnakkaista luokkaa, 
joissa kummassakin luodaan sopiva juoma.

Luo testiohjelmassasi jokaista otustyyppiä oleva olio ja laita ne aterioimaan.

*/