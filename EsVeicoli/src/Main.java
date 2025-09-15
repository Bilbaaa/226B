// Main.java
import main.fourwheels.Auto;
import main.fourwheels.AutoElettrica;
import main.fourwheels.Camion;
import main.twowheels.Moto;
import main.interfaces.*;
import main.service.AgenziaAssicurativa;
import main.service.Officina;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Camion camion = new Camion("AB123CD", "Iveco", "Stralis", 2, 20000);
        Moto moto = new Moto("ZZ999YY", "Ducati", "Panigale", 2, "Sportiva");
        Auto miaAuto = new Auto("39029", "Lamborghini", "Huracan", 2, 2);
        Moto miaMoto = new Moto("3249", "SWM", "SM125", 1, "Motard");
        AutoElettrica autoElettrica = new AutoElettrica("EL1234", "Tesla", "Model S", 5, 4, 85.5);

        System.out.println("=== TEST INTERFACCE ===");
        BigDecimal costoRiparazioneAuto = miaAuto.calcolaCostoRiparazione(10);
        System.out.println("Costo riparazione auto: €" + costoRiparazioneAuto);

        BigDecimal costoAssicurazioneMoto = miaMoto.getCostoAssicurazione();
        System.out.println("Costo assicurazione moto: €" + costoAssicurazioneMoto);

        System.out.println("Autonomia batteria auto elettrica: " + autoElettrica.getAutonomiaBatteria() + "%");

        System.out.println("\n=== POLIMORFISMO INTERFACCE ===");
        Riparabile rip;
        Assicurabile ass;

        rip = miaAuto;
        System.out.println("Costo riparazione (polimorfismo): €" + rip.calcolaCostoRiparazione(5));

        ass = miaMoto;
        System.out.println("Costo assicurazione (polimorfismo): €" + ass.getCostoAssicurazione());


        System.out.println("\n=== TEST OFFICINA E AGENZIA ===");
        Officina officina = new Officina();
        AgenziaAssicurativa agenzia = new AgenziaAssicurativa();

        officina.accettaVeicolo(miaAuto);
        officina.accettaVeicolo(miaMoto);
        officina.accettaVeicolo(autoElettrica);

        agenzia.aggiungiVeicolo(miaMoto);

        officina.stampaSchedarioRiparazioni();

        BigDecimal incassoTotale = agenzia.calcolaIncassoTotale();
        System.out.println("\nIncasso totale assicurazioni: €" + incassoTotale);

        System.out.println("\n=== TEST RICARICA AUTO ELETTRICA ===");
        autoElettrica.ricarica();
        System.out.println("Autonomia dopo ricarica: " + autoElettrica.getAutonomiaBatteria() + "%");

        System.out.println("\n=== RUMORI VEICOLI ===");
        camion.faiRumore();
        moto.faiRumore();
        miaAuto.faiRumore();
    }
}