import main.fourwheels.Camion;
import main.twowheels.Moto;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("AB123CD", "Iveco", "Stralis", 2, 20000);
        Moto moto = new Moto("ZZ999YY", "Ducati", "Panigale", 2, "Sportiva");

        camion.faiRumore();
        moto.faiRumore();


    }
}
