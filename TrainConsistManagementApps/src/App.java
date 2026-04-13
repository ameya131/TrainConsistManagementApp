/**
 * =======================================================
 * UC17 - Arrays.sort() (Optimized Built-in Sorting)
 * =======================================================
 * Description:
 * This class demonstrates the use of the Java Standard
 * Library to sort an array of bogie types alphabetically.
 */

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("         UC17 - Bogie Type Alpha Sort         ");
        System.out.println("==============================================\n");

        // 1. Initialize an array of Strings (Bogie Types)
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General"};

        System.out.println("Original List: " + Arrays.toString(bogieTypes));

        // 2. Use Arrays.sort()
        // For Strings, this sorts them in lexicographical (alphabetical) order
        Arrays.sort(bogieTypes);

        // 3. Display the sorted result
        System.out.println("Sorted List:   " + Arrays.toString(bogieTypes));

        System.out.println("\nUC17: Built-in sorting completed.");
    }
}