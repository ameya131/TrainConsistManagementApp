import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =======================================================
 * MAIN CLASS - App (Use Case 8: Filter Passenger Bogies)
 * =======================================================
 * * Description:
 * This class filters passenger bogies based on seating
 * capacity using the Java Stream API.
 * * * At this stage, the application:
 * - Creates a List of bogies
 * - Converts list into stream
 * - Applies filter condition (Capacity > 60)
 * - Collects filtered result
 * - Displays qualifying bogies
 * * * This maps functional filtering using Streams.
 * * * @author Developer
 * @version 8.0
 */
public class App {

    // Reusing Bogie model from UC7
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
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("=========================================\n");

        // Create List of passenger bogies (Same style as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display All Bogies
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // ---- Stream Filtering Logic ----
        // 1. stream() converts list to a pipeline
        // 2. filter() selects bogies with capacity > 60
        // 3. collect() gathers results into a new list
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display Filtered Results
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nUC8 filtering completed...");
    }
}