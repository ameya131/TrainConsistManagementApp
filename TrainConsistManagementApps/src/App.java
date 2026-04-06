import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - App (Use Case 7: Sort Bogies by Capacity)
 * =======================================================
 * * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 * * * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a List
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 * * * This maps custom ordering using Comparator.
 * * * @author Developer
 * @version 7.0
 */
public class App {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        // Header Display
        System.out.println("=========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("=========================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // Adding Bogie objects to the list
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // 1. Display Before Sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 2. Sorting logic using Comparator
        // We compare the capacity field of the Bogie objects
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 3. Display After Sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}