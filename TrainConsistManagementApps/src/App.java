import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * =======================================================
 * MAIN CLASS - App (Use Case 9: Group Bogies by Type)
 * =======================================================
 * * Description:
 * This class groups bogies into categories based on their
 * names using the Stream groupingBy collector.
 * * * At this stage, the application:
 * - Creates a List of bogie objects
 * - Converts list into stream
 * - Applies groupingBy() collector
 * - Stores results in a Map
 * - Displays grouped bogie categories
 * * * This maps categorical grouping using Streams.
 * * * @author Developer
 * @version 9.0
 */
public class App {

    // Reusing Bogie model from previous use cases
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Bogie{name='" + name + "', capacity=" + capacity + "}";
        }
    }

    public static void main(String[] args) {
        // Header Display
        System.out.println("=========================================");
        System.out.println(" UC9 - Group Bogies by Type (groupingBy) ");
        System.out.println("=========================================\n");

        // Create List of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72)); // Multiple bogies of same type
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        // ---- Stream Grouping Logic ----
        // groupingBy(b -> b.name) creates a Map where:
        // Key = Bogie Name (String)
        // Value = List of Bogies with that name
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display the Grouped Results
        System.out.println("Bogies Grouped by Type:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });

        System.out.println("\nUC9 grouping operations completed...");
    }
}