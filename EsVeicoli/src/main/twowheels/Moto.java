// Moto.java
package main.twowheels;

import main.Veicolo;
import main.interfaces.Assicurabile;
import main.interfaces.Riparabile;
import java.math.BigDecimal;

public final class Moto extends Veicolo implements Assicurabile, Riparabile {
    private String tipo;

    public Moto(String targa, String marca, String modello, int numeroPosti, String tipo) {
        super(targa, marca, modello, numeroPosti);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void faiRumore() {
        System.out.println("Braaaap");
    }

    @Override
    public BigDecimal getCostoAssicurazione() {
        return new BigDecimal("250");
    }

    @Override
    public BigDecimal calcolaCostoRiparazione(int oreLavoro) {
        return new BigDecimal(oreLavoro * 30.0 + 50);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}