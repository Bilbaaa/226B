public abstract class BaseVeicolo implements Veicolo {
    protected String marca;
    protected String modello;
    protected boolean inMovimento;
    protected Carburante carburante;
    protected String destinazione;
    protected double distanza;

    public BaseVeicolo(String marca, String modello, boolean inMovimento, Carburante carburante, String destinazione, double distanza) {
        this.marca = marca;
        this.modello = modello;
        this.inMovimento = inMovimento;
        this.carburante = carburante;
        this.destinazione = destinazione;
        this.distanza = distanza;
    }

    @Override
    public void assegnaDestinazione(String destinazione) {
        this.destinazione = destinazione;
        System.out.println(marca + " " + modello + " has been assigned to destination: " + destinazione);
    }

    @Override
    public void logPartenza() {
        this.inMovimento = true;
        System.out.println("Status: Vehicle is in motion.");
    }

    @Override
    public void logArrivo(double distanzaKm) {
        this.inMovimento = false;
        System.out.println("Arrived at destination. Total km traveled: " + String.format("%.2f", distanzaKm) + " km.");
        System.out.println("Status: Vehicle is stationary.");
    }
}
