import java.util.ArrayList;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - App (Use Case 12: Safety Compliance Check)
 * =======================================================
 * * Description:
 * This class validates whether a train's goods bogies adhere
 * to safety rules (e.g., Cylindrical bogies only carry Petroleum).
 * * * At this stage, the application:
 * - Creates a List of GoodsBogie objects
 * - Converts list to a stream
 * - Uses allMatch() to verify safety constraints
 * - Reports whether the train is safe to depart
 * * * This maps rule enforcement using Stream allMatch.
 * * * @author Developer
 * @version 12.0
 */
public class App {

    // Model for Goods Bogies
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return "GoodsBogie{type='" + type + "', cargo='" + cargo + "'}";
        }
    }

    public static void main(String[] args) {
        // Header Display
        System.out.println("=========================================");
        System.out.println(" UC12 - Safety Compliance Check (allMatch) ");
        System.out.println("=========================================\n");

        // Create List of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Open", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Box", "Grain"));
        // Uncomment the line below to trigger a safety violation:
        // goodsConsist.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display current goods consist
        System.out.println("Checking Goods Train Consist:");
        goodsConsist.forEach(System.out::println);

        // ---- Stream Safety Logic ----
        // Rule: IF type is "Cylindrical", THEN cargo MUST BE "Petroleum"
        // allMatch returns true only if EVERY element satisfies the predicate
        boolean isSafe = goodsConsist.stream().allMatch(b -> {
            if (b.type.equalsIgnoreCase("Cylindrical")) {
                return b.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Other bogies are considered safe for any cargo here
        });

        // Display the Validation Result
        System.out.println("\n-----------------------------------------");
        if (isSafe) {
            System.out.println("STATUS: TRAIN IS SAFETY COMPLIANT");
            System.out.println("Action: Departure approved.");
        } else {
            System.out.println("STATUS: SAFETY VIOLATION DETECTED!");
            System.out.println("Action: Train halted for cargo inspection.");
        }
        System.out.println("-----------------------------------------");

        System.out.println("\nUC12 safety operations completed...");
    }
}