/**
 * =======================================================
 * UC18 - Linear Search (Manual Search)
 * =======================================================
 * Description:
 * This class demonstrates how to search for a specific Bogie ID
 * within an array using the Linear Search algorithm.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("          UC18 - Bogie ID Search             ");
        System.out.println("==============================================\n");

        // 1. The dataset (Array of Bogie IDs)
        String[] bogieIDs = {"BG101", "BG205", "BG309"};

        // 2. The item we are looking for
        String searchKey = "BG205";

        boolean isFound = false;

        // 3. Linear Search Logic
        // We iterate through each element 's' in the array
        for (String s : bogieIDs) {
            if (s.equals(searchKey)) {
                isFound = true;
                break; // Exit the loop early as we've found our target
            }
        }

        // 4. Output the result
        if (isFound) {
            System.out.println("Result: Bogie " + searchKey + " was found in the consist.");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found.");
        }

        System.out.println("\nUC18: Search operation completed.");
    }
}