

public abstract class DigitalContent implements Purchasable {
    protected String id;
    protected String title;
    protected String author;
    protected double basePrice;
    protected double currentDiscount;

    public DigitalContent(String id, String title, String author, double basePrice) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.basePrice = basePrice;
        this.currentDiscount = 0.0;
    }

    // Metodi astratti
    public abstract String getContentType();
    public abstract String getDescription();

    // Implementazione interfaccia Purchasable
    @Override
    public double calculatePrice() {
        return basePrice * (1 - currentDiscount);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.currentDiscount = percentage / 100.0;
    }

    // Getter e Setter
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getBasePrice() { return basePrice; }
    public double getCurrentDiscount() { return currentDiscount; }

    public void setBasePrice(double basePrice) { this.basePrice = basePrice; }
}