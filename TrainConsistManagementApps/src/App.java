/**
 * =======================================================
 * UC15 - Cargo Safety (try-catch-finally)
 * =======================================================
 * Description:
 * This class validates cargo safety using a RuntimeException.
 * It demonstrates the use of 'finally' to ensure the
 * "Operation Completed" message always displays.
 */

// Custom Runtime Exception for safety violations
class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String msg) {
        super(msg);
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("          UC15 - Cargo Safety Check           ");
        System.out.println("==============================================\n");

        String shape = "Rectangular";
        String cargo = "Petroleum";

        try {
            // Business Rule: Petroleum cannot be carried in Rectangular bogies
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe Cargo! Petroleum requires Cylindrical bogies.");
            }

            // This line only runs if no exception is thrown
            System.out.println("Cargo Assigned successfully.");

        } catch (CargoSafetyException e) {
            // Handles the safety violation
            System.out.println("ALERT: " + e.getMessage());

        } finally {
            // This block ALWAYS executes, making it ideal for cleanup or final logging
            System.out.println("Cleanup: Closing safety logs...");
            System.out.println("Operation Completed.");
        }
    }
}