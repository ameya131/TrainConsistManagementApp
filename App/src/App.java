import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =======================================================
 * MAIN CLASS - App
 * =======================================================
 * Use Case 13: Performance Comparison (Loops vs Streams)
 * * Description:
 * This class compares execution time of loop-based filtering
 * versus stream-based filtering using System.nanoTime().
 */
public class App {

    // Bogie model as per hints
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("==============================================\n");

        // 1. User prepares a collection of bogies (Large dataset for benchmarking)
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("Chair Car", 40));
            bogies.add(new Bogie("General", 90));
        }

        // --- LOOP BASED FILTERING ---
        // 2. System records start time
        long loopStart = System.nanoTime();

        // 3. Filtering performed using a loop (Capacity > 60)
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        // 4. System records end time
        long loopEnd = System.nanoTime();

        // 5. Elapsed time is calculated
        long loopDuration = loopEnd - loopStart;

        // --- STREAM BASED FILTERING ---
        // 2. System records start time
        long streamStart = System.nanoTime();

        // 3. Filtering performed using a stream (Capacity > 60)
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 4. System records end time
        long streamEnd = System.nanoTime();

        // 5. Elapsed time is calculated
        long streamDuration = streamEnd - streamStart;

        // 6. Execution time is displayed
        System.out.println("Loop Execution Time (ns): " + loopDuration);
        System.out.println("Stream Execution Time (ns): " + streamDuration);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}