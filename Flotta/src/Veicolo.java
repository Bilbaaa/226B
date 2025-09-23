public interface Veicolo {
    void assegnaDestinazione(String destinazione);
    void logPartenza();
    void logArrivo(double distanzaKm);
    double calcolaCostoCarburante(double distanzaKm);
}
