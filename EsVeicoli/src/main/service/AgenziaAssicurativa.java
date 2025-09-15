// AgenziaAssicurativa.java
package main.service;

import main.interfaces.Assicurabile;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class AgenziaAssicurativa {
    private Set<Assicurabile> veicoliAssicurati = new HashSet<>();

    public void aggiungiVeicolo(Assicurabile veicolo) {
        veicoliAssicurati.add(veicolo);
        System.out.println("Veicolo " + veicolo.getClass().getSimpleName() + " aggiunto all'agenzia assicurativa");
    }

    public BigDecimal calcolaIncassoTotale() {
        BigDecimal totale = BigDecimal.ZERO;
        for (Assicurabile veicolo : veicoliAssicurati) {
            totale = totale.add(veicolo.getCostoAssicurazione());
        }
        return totale;
    }
}