package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };

}

/*
Kirjoita Opettaja-luokalle kaksi rinnakkaista luokkaa, 
joissa kummassakin luodaan sopiva juoma.
*/