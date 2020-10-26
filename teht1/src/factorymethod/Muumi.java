package factorymethod;

public class Muumi extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Viina();
    };

}
