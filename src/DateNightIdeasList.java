import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    public void readIdeasFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    String title = parts[0].trim();
                    String description = parts[1].trim();
                    String category = parts[2].trim();
                    DateNightIdea idea = new DateNightIdea(title, description, category);
                    addIdea(idea);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        }
    }
}
