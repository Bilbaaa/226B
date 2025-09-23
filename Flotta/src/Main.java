public class Main {
    public static void main(String[] args) {
        double distanza = 500.0;

        Veicolo car = new Car("Honda", "Civic", true, Carburante.GASOLINE, "New Yourk", 0);
        Veicolo truck = new Truck("Volvo", "FH16", true, Carburante.DIESEL, "Losa Ngeles", 0);
        Veicolo tesla = new Car("Tesla", "Model S", true, Carburante.ELECTRIC, "Roma", 0);

        Veicolo[] veicoli = {car, truck, tesla};

        for (Veicolo v : veicoli) {
            v.assegnaDestinazione("City Center");
            v.logPartenza();
            v.calcolaCostoCarburante(distanza);
            v.logArrivo(distanza);
            System.out.println();
        }
    }
}
