/**
 * =======================================================
 * UC14 - Custom Exception (Invalid Capacity)
 * =======================================================
 * Description:
 * This class demonstrates how to create and throw a custom
 * exception when a Bogie's capacity is invalid (<= 0).
 */

// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String msg) {
        super(msg);
    }
}

// Bogie model with validation logic
class Bogie {
    int capacity;

    Bogie(int capacity) throws InvalidCapacityException {
        // Business Rule: Capacity must be a positive integer
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be > 0. Provided: " + capacity);
        }
        this.capacity = capacity;
    }
}

// Main Execution Class
public class App {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("       UC14 - Custom Exception Testing        ");
        System.out.println("==============================================\n");

        try {
            // Attempting to create a Bogie with invalid (negative) capacity
            System.out.println("Attempting to create a Bogie with capacity: -10...");
            Bogie b = new Bogie(-10);

            // This line will not execute if the exception is thrown
            System.out.println("Bogie created successfully with capacity: " + b.capacity);

        } catch (InvalidCapacityException e) {
            // Handling the custom exception
            System.err.println("Caught Custom Exception: " + e.getMessage());
        }

        System.out.println("\nUC14 execution completed.");
    }
}