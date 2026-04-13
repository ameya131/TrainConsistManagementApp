/**
 * =======================================================
 * UC19 - Binary Search (Divide and Conquer)
 * =======================================================
 * Description:
 * This class demonstrates searching for a Bogie ID using
 * Binary Search. It splits the search area in half each time.
 */

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("          UC19 - Binary Search Logic          ");
        System.out.println("==============================================\n");

        // 1. Unsorted dataset
        String[] bogieIDs = {"BG309", "BG101", "BG205"};

        // 2. IMPORTANT: Binary search requires a sorted array
        Arrays.sort(bogieIDs);
        System.out.println("Sorted IDs for Search: " + Arrays.toString(bogieIDs));

        String key = "BG205";
        boolean found = false;

        // 3. Define the search boundaries
        int low = 0;
        int high = bogieIDs.length - 1;

        // 4. Binary Search Loop
        while (low <= high) {
            // Calculate the middle index
            int mid = (low + high) / 2;

            // compareTo returns 0 if match, < 0 if before key, > 0 if after key
            int cmp = bogieIDs[mid].compareTo(key);

            if (cmp == 0) {
                found = true;
                break; // Target found!
            } else if (cmp < 0) {
                // If mid is less than key, ignore the left half
                low = mid + 1;
            } else {
                // If mid is greater than key, ignore the right half
                high = mid - 1;
            }
        }

        System.out.println("Search Key: " + key);
        System.out.println("Found: " + found);

        System.out.println("\nUC19: Binary search operation completed.");
    }
}