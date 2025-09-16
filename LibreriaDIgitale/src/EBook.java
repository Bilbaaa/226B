

public class EBook extends DigitalContent {
    private Genre genre;
    private int pageCount;
    private boolean isIllustrated;

    public EBook(String id, String title, String author, double basePrice,
                 Genre genre, int pageCount, boolean isIllustrated) {
        super(id, title, author, basePrice);
        this.genre = genre;
        this.pageCount = pageCount;
        this.isIllustrated = isIllustrated;
    }

    @Override
    public String getContentType() {
        return "E-Book";
    }

    @Override
    public String getDescription() {
        return String.format("E-Book '%s' by %s, %s, %d pages%s",
                title, author, genre, pageCount,
                isIllustrated ? " (Illustrated)" : "");
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        if (isIllustrated) {
            price *= 1.15; // +15% se illustrato
        }
        return price;
    }

    public int getReadingTime() {
        return (int) Math.ceil(pageCount / 2.0); // 2 pagine al minuto
    }

    // Getter
    public Genre getGenre() { return genre; }
    public int getPageCount() { return pageCount; }
    public boolean isIllustrated() { return isIllustrated; }
}