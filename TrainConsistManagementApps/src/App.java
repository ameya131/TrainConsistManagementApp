/**
 * =======================================================
 * UC20 - Exception Handling in Search
 * =======================================================
 * Description:
 * This class demonstrates defensive programming by throwing
 * an IllegalStateException if a search is attempted on an
 * empty consist (array).
 */

public class App {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("      UC20 - Search Exception Handling        ");
        System.out.println("==============================================\n");

        // 1. Scenario: An empty array (The train has no bogies attached)
        String[] bogieIDs = {};
        String searchKey = "BG101";

        try {
            // 2. Pre-condition Check (Defensive Programming)
            if (bogieIDs.length == 0) {
                // Throwing a built-in RuntimeException to signal an invalid state
                throw new IllegalStateException("Search Error: No bogies available in the consist.");
            }

            // 3. Search logic (will only execute if the array is NOT empty)
            boolean isFound = false;
            for (String s : bogieIDs) {
                if (s.equals(searchKey)) {
                    isFound = true;
                    break;
                }
            }
            System.out.println("Bogie Found: " + isFound);

        } catch (IllegalStateException e) {
            // 4. Gracefully handling the exception
            System.err.println("ALERT: " + e.getMessage());
        }

        System.out.println("\nUC20: Defensive search check completed.");
    }
}