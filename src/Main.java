public class Main {
    public static void main(String[] args) {
        DateNightIdeasList ideasList = new DateNightIdeasList();
        ideasList.readIdeasFromFile("src/date_night_ideas.txt");
        DateNightIdea randomIdea = ideasList.getRandomIdea();

        if (randomIdea != null) {
            System.out.println("Random Date Night Idea:");
            System.out.println(randomIdea);
        } else {
            System.out.println("No date night ideas in the list.");
        }
    }
}
