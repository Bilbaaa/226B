// Auto.java
package main.fourwheels;

import main.Veicolo;
import main.interfaces.Riparabile;
import java.math.BigDecimal;
import java.util.Objects;

public class Auto extends Veicolo implements Riparabile {
    private int numeroPorte;

    public Auto(String targa, String marca, String modello, int numeroPosti, int numeroPorte) {
        super(targa, marca, modello, numeroPosti);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return numeroPorte == auto.numeroPorte;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroPorte);
    }

    @Override
    public BigDecimal calcolaCostoRiparazione(int oreLavoro) {
        return new BigDecimal(oreLavoro * 45.0 + 100);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numeroPorte=" + numeroPorte +
                "} " + super.toString();
    }
}