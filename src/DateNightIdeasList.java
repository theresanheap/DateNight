import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DateNightIdeasList {
    private List<DateNightIdea> ideas;

    public DateNightIdeasList() {
        this.ideas = new ArrayList<>();
    }

    // Add a new date night idea to the list
    public void addIdea(DateNightIdea idea) {
        ideas.add(idea);
    }

    // Remove a date night idea from the list
    public void removeIdea(DateNightIdea idea) {
        ideas.remove(idea);
    }

    // Get a random date night idea from the list
    public DateNightIdea getRandomIdea() {
        if (ideas.isEmpty()) {
            return null; // Return null if the list is empty
        }

        Random random = new Random();
        int randomIndex = random.nextInt(ideas.size());
        return ideas.get(randomIndex);
    }

    // Other methods for managing the list
    // ...
}
