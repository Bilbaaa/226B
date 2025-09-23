public class Truck extends BaseVeicolo {

    public Truck(String marca, String modello, boolean inMovimento, Carburante carburante, String destinazione, double distanza) {
        super(marca, modello, inMovimento, carburante, destinazione, distanza);
    }

    @Override
    public double calcolaCostoCarburante(double distanzaKm) {
        if (carburante == Carburante.ELECTRIC) {
            System.out.println("Truck " + marca + " " + modello + " is electric. No fuel cost.");
            return 0.0;
        }

        double consumoPerKm = carburante == Carburante.DIESEL ? 0.25 : 0.3;
        double prezzoPerLitro = carburante == Carburante.DIESEL ? 1.6 : 1.8;

        double costo = distanzaKm * consumoPerKm * prezzoPerLitro;
        System.out.printf("Truck %s %s fuel cost for %.2f km: $%.2f%n", marca, modello, distanzaKm, costo);
        return costo;
    }
}
