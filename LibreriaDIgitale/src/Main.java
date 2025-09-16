

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Creazione degli oggetti
        EBook ebook = new EBook("EB001", "Il Nome del Vento", "Patrick Rothfuss",
                15.99, Genre.FICTION, 662, false);

        AudioBook audiobook = new AudioBook("AB001", "1984", "George Orwell",
                12.50, "Marco Rossi", 523, "Italiano");

        DigitalMagazine magazine = new DigitalMagazine("DM001", "National Geographic",
                "Various", 4.99, 245,
                LocalDate.of(2024, 2, 15), "Science");

        OnlineCourse course = new OnlineCourse("OC001", "Java Programming",
                "Mario Bianchi", 49.99,
                "Luigi Verdi", Difficulty.INTERMEDIATE, 25.5);

        // Creazione HashSet di Purchasable
        HashSet<Purchasable> purchasableItems = new HashSet<>();

        // Inserimento oggetti (inseriamo lo stesso oggetto due volte)
        purchasableItems.add(ebook);
        purchasableItems.add(audiobook);
        purchasableItems.add(magazine);
        purchasableItems.add(course);
        purchasableItems.add(ebook); // Inserimento duplicato

        System.out.println("Numero di elementi nel set: " + purchasableItems.size());
        System.out.println("Il duplicato è stato ignorato grazie all'HashSet\n");

        // Ciclo attraverso il Set
        for (Purchasable item : purchasableItems) {
            System.out.println("=== " + item.getClass().getSimpleName() + " ===");

            // Metodi dell'interfaccia Purchasable (ereditati)
            System.out.println("Prezzo base: €" + String.format("%.2f", item.calculatePrice()));
            System.out.println("Prezzo con IVA: €" + String.format("%.2f", item.getPriceWithTax()));
            System.out.println("Metodo calculatePrice(): EREDITATO");
            System.out.println("Metodo getPriceWithTax(): EREDITATO (default method)");
            System.out.println("Metodo getDefaultTaxRate(): EREDITATO (static method)");

            // Applica uno sconto
            item.applyDiscount(10);
            System.out.println("Prezzo scontato: €" + String.format("%.2f", item.calculatePrice()));
            System.out.println("Metodo applyDiscount(): EREDITATO");

            // Metodi polimorfici (se l'oggetto è DigitalContent)
            if (item instanceof DigitalContent) {
                DigitalContent content = (DigitalContent) item;
                System.out.println("Tipo contenuto: " + content.getContentType());
                System.out.println("Descrizione: " + content.getDescription());
                System.out.println("Metodo getContentType(): POLIMORFO");
                System.out.println("Metodo getDescription(): POLIMORFO");

                // Metodi specifici per ogni tipo
                if (content instanceof EBook) {
                    EBook eBook = (EBook) content;
                    System.out.println("Tempo lettura: " + eBook.getReadingTime() + " minuti");
                    System.out.println("Metodo getReadingTime(): SPECIFICO (solo EBook)");
                }
                else if (content instanceof AudioBook) {
                    AudioBook audioBook = (AudioBook) content;
                    System.out.println("Durata formattata: " + audioBook.getFormattedDuration());
                    System.out.println("Metodo getFormattedDuration(): SPECIFICO (solo AudioBook)");
                }
                else if (content instanceof DigitalMagazine) {
                    DigitalMagazine digitalMagazine = (DigitalMagazine) content;
                    System.out.println("Rivista recente: " + digitalMagazine.isRecentIssue());
                    System.out.println("Metodo isRecentIssue(): SPECIFICO (solo DigitalMagazine)");
                }
                else if (content instanceof OnlineCourse) {
                    OnlineCourse onlineCourse = (OnlineCourse) content;
                    System.out.println("Certificazione disponibile: " + onlineCourse.getCertificationEligible());
                    System.out.println("Metodo getCertificationEligible(): SPECIFICO (solo OnlineCourse)");
                }
            }

            System.out.println();
        }
    }
}