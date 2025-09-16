
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DigitalMagazine extends DigitalContent {
    private int issueNumber;
    private LocalDate publicationDate;
    private String category;

    public DigitalMagazine(String id, String title, String author, double basePrice,
                           int issueNumber, LocalDate publicationDate, String category) {
        super(id, title, author, basePrice);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.category = category;
    }

    @Override
    public String getContentType() {
        return "Digital Magazine";
    }

    @Override
    public String getDescription() {
        return String.format("Magazine '%s' - Issue %d, %s, published %s",
                title, issueNumber, category, publicationDate);
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        if (isRecentIssue()) {
            price *= 1.10; // +10% se rivista recente
        }
        return price;
    }

    public boolean isRecentIssue() {
        return ChronoUnit.DAYS.between(publicationDate, LocalDate.now()) <= 30;
    }

    // Getter
    public int getIssueNumber() { return issueNumber; }
    public LocalDate getPublicationDate() { return publicationDate; }
    public String getCategory() { return category; }
}