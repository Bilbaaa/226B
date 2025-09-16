

public final class OnlineCourse extends DigitalContent {
    private String instructor;
    private Difficulty difficulty;
    private double estimatedHours;

    public OnlineCourse(String id, String title, String author, double basePrice,
                        String instructor, Difficulty difficulty, double estimatedHours) {
        super(id, title, author, basePrice);
        this.instructor = instructor;
        this.difficulty = difficulty;
        this.estimatedHours = estimatedHours;
    }

    @Override
    public String getContentType() {
        return "Online Course";
    }

    @Override
    public String getDescription() {
        return String.format("Course '%s' by %s, taught by %s (%s level, %.1f hours)",
                title, author, instructor, difficulty, estimatedHours);
    }

    public boolean getCertificationEligible() {
        return estimatedHours > 10;
    }

    // Getter
    public String getInstructor() { return instructor; }
    public Difficulty getDifficulty() { return difficulty; }
    public double getEstimatedHours() { return estimatedHours; }
}