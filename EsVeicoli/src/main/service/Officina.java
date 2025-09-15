// Officina.java
package main.service;

import main.interfaces.Riparabile;
import java.util.ArrayList;
import java.util.List;

public class Officina {
    private List<Riparabile> veicoliInRiparazione = new ArrayList<>();

    public void accettaVeicolo(Riparabile veicolo) {
        veicoliInRiparazione.add(veicolo);
        System.out.println("Veicolo " + veicolo.getClass().getSimpleName() + " aggiunto all'officina");
    }

    public void stampaSchedarioRiparazioni() {
        System.out.println("\n=== SCHEDARIO RIPARAZIONI ===");
        if (veicoliInRiparazione.isEmpty()) {
            System.out.println("Nessun veicolo in riparazione");
            return;
        }

        for (Riparabile veicolo : veicoliInRiparazione) {
            System.out.println("- " + veicolo.getClass().getSimpleName() + " in riparazione");
        }
        System.out.println("Totale veicoli: " + veicoliInRiparazione.size());
    }
}