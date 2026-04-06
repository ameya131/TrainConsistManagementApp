import java.util.ArrayList;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - App (Use Case 10: Count Total Seats)
 * =======================================================
 * * Description:
 * This class calculates the total seating capacity of the
 * train using the Stream map() and reduce() operations.
 * * * At this stage, the application:
 * - Creates a List of Bogie objects
 * - Converts list to a stream
 * - Maps bogie objects to their capacity (Integer)
 * - Reduces capacities into a single sum
 * - Displays the total passenger capacity
 * * * This maps functional aggregation using Streams.
 * * * @author Developer
 * @version 10.0
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
            return name + " (Seats: " + capacity + ")";
        }
    }

    public static void main(String[] args) {
        // Header Display
        System.out.println("=========================================");
        System.out.println(" UC10 - Count Total Seats in Train (reduce) ");
        System.out.println("=========================================\n");

        // Create List of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display current train consist
        System.out.println("Current Train Consist:");
        bogies.forEach(System.out::println);

        // ---- Stream Reduction Logic ----
        // 1. stream() starts the pipeline
        // 2. map(b -> b.capacity) extracts the numbers: [72, 56, 24, 90]
        // 3. reduce(0, Integer::sum) adds them: 0 + 72 + 56 + 24 + 90
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display the Aggregated Result
        System.out.println("\nTotal Seating Capacity of the Train: " + totalSeats);

        System.out.println("\nUC10 aggregation operations completed...");
    }
}