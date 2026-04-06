import java.util.HashSet;
import java.util.Set;

/**
 * =======================================================
 * MAIN CLASS - App (Use Case 3: Train Consist Management)
 * =======================================================
 * * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 * * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 * * This maps uniqueness validation using Set.
 * * @author Developer
 * @version 3.0
 */
public class App {

    public static void main(String[] args) {
        // Header Display
        System.out.println("=========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        // add() inserts bogie IDs into the set
        bogies.add("B6101");
        bogies.add("B6102");
        bogies.add("B6103");
        bogies.add("B6104");

        // Duplicate entries will be ignored internally by HashSet
        bogies.add("B6101"); // Duplicate entry
        bogies.add("B6102"); // Duplicate entry

        // Display the results
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}