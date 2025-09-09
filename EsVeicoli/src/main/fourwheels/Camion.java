package main.fourwheels;

import main.Veicolo;

public class Camion extends Veicolo {
    private double capacitaMassimaCarico;

    public Camion(String targa, String marca, String modello, int numeroPosti, double capacitaMassimaCarico) {
        super(targa, marca, modello, numeroPosti);
        this.capacitaMassimaCarico = capacitaMassimaCarico;
    }
}
