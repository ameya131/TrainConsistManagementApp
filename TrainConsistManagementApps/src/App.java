import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS – UseCase2TrainConsistMgmt
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */
public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=====================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after addition: " + passengerBogies);

        // ---- DELETE (Remove bogie) ----
        passengerBogies.remove("AC Chair");
        System.out.println("Bogies after removing AC Chair: " + passengerBogies);

        // ---- READ (Check existence) ----
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper bogie available? " + (hasSleeper ? "Yes" : "No"));

        // Final state
        System.out.println("Final bogie composition: " + passengerBogies);

        System.out.println("\nSystem ready for further operations...");
    }
}