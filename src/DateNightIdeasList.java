import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DateNightIdeasList {
    private List<DateNightIdea> ideas;

    public DateNightIdeasList() {
        this.ideas = new ArrayList<>();
    }

    public void addIdea(DateNightIdea idea) {
        ideas.add(idea);
    }

    public void removeIdea(DateNightIdea idea) {
        ideas.remove(idea);
    }

    public DateNightIdea getRandomIdea() {
        if (ideas.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(ideas.size());
        return ideas.get(randomIndex);
    }
}
