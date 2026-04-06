import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =======================================================
 * MAIN CLASS - App (Use Case 11: Validate Train ID & Cargo Codes)
 * =======================================================
 * * Description:
 * This class ensures that Train IDs and Cargo Codes follow
 * strict business rules using Regular Expressions (Regex).
 * * * At this stage, the application:
 * - Defines regex patterns for identifiers
 * - Compiles patterns into Pattern objects
 * - Validates input using Matcher.matches()
 * - Rejects malformed data to ensure integrity
 * * * This maps format enforcement using Regex.
 * * * @author Developer
 * @version 11.0
 */
public class App {

    public static void main(String[] args) {
        // Header Display
        System.out.println("=========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes (Regex) ");
        System.out.println("=========================================\n");

        // 1. Define Regex Patterns
        // TRN-\\d{4} matches "TRN-" followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET-[A-Z]{2} matches "PET-" followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile Patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // 3. Test Cases (Valid and Invalid)
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XYZ"};

        // Validate Train IDs
        System.out.println("--- Train ID Validation ---");
        for (String id : testTrainIds) {
            Matcher matcher = trainPattern.matcher(id);
            boolean isValid = matcher.matches();
            System.out.println("Input: " + id + " -> " + (isValid ? "VALID" : "INVALID"));
        }

        // Validate Cargo Codes
        System.out.println("\n--- Cargo Code Validation ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoPattern.matcher(code);
            boolean isValid = matcher.matches();
            System.out.println("Input: " + code + " -> " + (isValid ? "VALID" : "INVALID"));
        }

        System.out.println("\nUC11 validation operations completed...");
    }
}