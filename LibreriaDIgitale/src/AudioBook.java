
public class AudioBook extends DigitalContent {
    private String narrator;
    private int duration; // in minuti
    private String language;

    public AudioBook(String id, String title, String author, double basePrice,
                     String narrator, int duration, String language) {
        super(id, title, author, basePrice);
        this.narrator = narrator;
        this.duration = duration;
        this.language = language;
    }

    @Override
    public String getContentType() {
        return "Audio Book";
    }

    @Override
    public String getDescription() {
        return String.format("Audio Book '%s' by %s, narrated by %s, %s",
                title, author, narrator, getFormattedDuration());
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        if (duration > 480) { // 8 ore = 480 minuti
            price *= 1.20; // +20% se durata > 8 ore
        }
        return price;
    }

    public String getFormattedDuration() {
        int hours = duration / 60;
        int minutes = duration % 60;
        return String.format("%d:%02d", hours, minutes);
    }

    // Getter
    public String getNarrator() { return narrator; }
    public int getDuration() { return duration; }
    public String getLanguage() { return language; }
}