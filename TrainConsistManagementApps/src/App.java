/**
 * =======================================================
 * UC16 - Bubble Sort (Manual Array Sorting)
 * =======================================================
 * Description:
 * This class implements the Bubble Sort algorithm to sort
 * an array of bogie capacities in ascending order.
 */

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("          UC16 - Bogie Capacity Sort          ");
        System.out.println("==============================================\n");

        // Sample array of bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities: " + Arrays.toString(capacities));

        // Bubble Sort Algorithm
        // The outer loop controls the number of passes
        for (int i = 0; i < capacities.length; i++) {

            // The inner loop performs the adjacent comparisons
            // We use 'capacities.length - 1' to avoid ArrayIndexOutOfBounds
            for (int j = 0; j < capacities.length - 1; j++) {

                // If the current element is greater than the next, swap them
                if (capacities[j] > capacities[j + 1]) {
                    // Temporary variable to hold the value during the swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display the final sorted array
        System.out.println("Sorted Capacities:   " + Arrays.toString(capacities));

        System.out.println("\nUC16: Sorting operation completed successfully.");
    }
}