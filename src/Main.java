public class Main {
    public static void main(String[] args) {
        DateNightIdeasList ideasList = new DateNightIdeasList();

        // Add some date night ideas to the list
        ideasList.addIdea(new DateNightIdea("Romantic candlelit dinner at a cozy restaurant.", "Enjoy a romantic dinner at a fancy restaurant", "Romance"));
        ideasList.addIdea(new DateNightIdea("Picnic in the park with your favorite snacks.", "Have a relaxing picnic in the park with your favorite snacks", "Outdoor"));
        ideasList.addIdea(new DateNightIdea("Movie night at home with popcorn and blankets.", "Watch a movie together at home with popcorn and cozy blankets", "Entertainment"));
        ideasList.addIdea(new DateNightIdea("Stargazing in a quiet location away from city lights.", "Enjoy stargazing in a peaceful location away from city lights", "Outdoor"));
        ideasList.addIdea(new DateNightIdea("Cooking a fancy meal together at home.", "Prepare and cook a fancy meal together at home", "Food"));
        ideasList.addIdea(new DateNightIdea("Visiting a local art gallery or museum.", "Explore local art and culture at an art gallery or museum", "Arts"));
        ideasList.addIdea(new DateNightIdea("Taking a scenic hike or nature walk.", "Go for a scenic hike or nature walk to appreciate the outdoors", "Outdoor"));
        ideasList.addIdea(new DateNightIdea("Attending a live music or comedy show.", "Enjoy live music or comedy performances together", "Entertainment"));
        ideasList.addIdea(new DateNightIdea("Trying out a new dessert cafe or ice cream parlor.", "Indulge in delicious desserts at a new cafe or ice cream parlor", "Food"));
        ideasList.addIdea(new DateNightIdea("Playing board games or video games together.", "Have fun playing board games or video games together", "Games"));
        ideasList.addIdea(new DateNightIdea("Going to a wine tasting event or winery.", "Experience different wines at a wine tasting event or winery", "Food"));
        ideasList.addIdea(new DateNightIdea("Taking a dance class together (e.g., salsa, ballroom).", "Learn to dance together in a fun dance class", "Entertainment"));
        ideasList.addIdea(new DateNightIdea("Exploring a nearby town or city as tourists.", "Be tourists in a nearby town or city and explore its attractions", "Travel"));
        ideasList.addIdea(new DateNightIdea("Having a spa night at home with massages and facials.", "Relax and pamper yourselves with massages and facials at home", "Relaxation"));
        ideasList.addIdea(new DateNightIdea("Attending a cooking class or food workshop.", "Learn new cooking skills together at a cooking class or food workshop", "Food"));
        ideasList.addIdea(new DateNightIdea("Watching the sunset at a beautiful spot.", "Catch a stunning sunset together at a picturesque location", "Outdoor"));
        ideasList.addIdea(new DateNightIdea("Taking a boat or ferry ride on a nearby lake or river.", "Enjoy a boat or ferry ride on a nearby lake or river", "Outdoor"));
        ideasList.addIdea(new DateNightIdea("Visiting a botanical garden or flower show.", "Explore the beauty of nature at a botanical garden or flower show", "Outdoor"));
        ideasList.addIdea(new DateNightIdea("Going on a double date with friends.", "Have a fun double date with friends", "Social"));
        ideasList.addIdea(new DateNightIdea("Participating in a local charity or volunteering together.", "Give back to the community by participating in a local charity or volunteering", "Social"));

        // Get a random date night idea
        DateNightIdea randomIdea = ideasList.getRandomIdea();

        if (randomIdea != null) {
            System.out.println("Random Date Night Idea:");
            System.out.println(randomIdea);
        } else {
            System.out.println("No date night ideas in the list.");
        }
    }
}
