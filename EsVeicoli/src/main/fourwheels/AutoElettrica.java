// AutoElettrica.java
package main.fourwheels;

import main.interfaces.VeicoloElettrico;

public class AutoElettrica extends Auto implements VeicoloElettrico {
    private double autonomiaBatteria;

    public AutoElettrica(String targa, String marca, String modello, int numeroPosti, int numeroPorte, double autonomiaBatteria) {
        super(targa, marca, modello, numeroPosti, numeroPorte);
        this.autonomiaBatteria = autonomiaBatteria;
    }

    @Override
    public double getAutonomiaBatteria() {
        return autonomiaBatteria;
    }

    @Override
    public void ricarica() {
        System.out.println("Ricarica della batteria in corso...");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("Ricarica al " + (i * 20 + 20) + "%");
            }
            autonomiaBatteria = 100;
            System.out.println("Ricarica completata al 100%!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void setAutonomiaBatteria(double autonomiaBatteria) {
        this.autonomiaBatteria = autonomiaBatteria;
    }

    @Override
    public String toString() {
        return "AutoElettrica{" +
                "autonomiaBatteria=" + autonomiaBatteria +
                "%} " + super.toString();
    }
}