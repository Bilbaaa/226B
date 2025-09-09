
package main;

import main.mechanics.Motore;

public class Veicolo {
    private String targa;
    private String marca;
    private final String modello; // non modificabile
    private int numeroPosti;
    private Motore motore;

    public Veicolo(String targa, String marca, String modello, int numeroPosti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numeroPosti = numeroPosti;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public Motore getMotore() {
        return motore;
    }

    public void setMotore(Motore motore) {
        this.motore = motore;
    }

    public void faiRumore() {
        System.out.println("Wruuuum");
    }

    // getter & setter (NO setter per modello)
    // equals & hashCode basati su marca+modello (case-insensitive)
    // toString
}
