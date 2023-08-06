public class DateNightIdea {
    private String title;
    private String description;
    private String category;
    public DateNightIdea(String title, String description, String category) {
        if (title == null || description == null || category == null) {
            throw new IllegalArgumentException("All parameters must be non-null");
        }
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nCategory: " + category;
    }


}
