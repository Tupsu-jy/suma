package factorymethod;

public class Tappjaisherhiläinen extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Veri();
    };

}