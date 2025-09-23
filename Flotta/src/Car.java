public class Car extends BaseVeicolo {

    public Car(String marca, String modello, boolean inMovimento, Carburante carburante, String destinazione, double distanza) {
        super(marca, modello, inMovimento, carburante, destinazione, distanza);
    }

    @Override
    public double calcolaCostoCarburante(double distanzaKm) {
        if (carburante == Carburante.ELECTRIC) {
            System.out.println("Car " + marca + " " + modello + " is electric. No fuel cost.");
            return 0.0;
        }

        double consumoPerKm = carburante == Carburante.GASOLINE ? 0.1 : 0.08;
        double prezzoPerLitro = carburante == Carburante.GASOLINE ? 1.8 : 1.6;

        double costo = distanzaKm * consumoPerKm * prezzoPerLitro;
        System.out.printf("Car %s %s fuel cost for %.2f km: $%.2f%n", marca, modello, distanzaKm, costo);
        return costo;
    }
}
