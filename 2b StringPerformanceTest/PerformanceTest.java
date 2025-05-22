/**
 * 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder
 * for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder.
 * Justify your answer which one is better.
 */
package StringPerformanceTest;
public class PerformanceTest {

    public static void main(String[] args) {
        int iterations = 10000;
        String appendStr = "AIET";

        // Test StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendStr);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendStr);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Print results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else if (durationBuilder > durationBuffer) {
            System.out.println("StringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("Both StringBuilder and StringBuffer took the same time.");
        }
    }
}
