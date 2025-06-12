package xyz;

import java.util.*;

public class MergeIntervals {

    // Method to merge overlapping intervals
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }

        // Sort intervals based on the starting times
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // List to hold merged intervals
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        // Iterate through the intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);

       
            if (current[0] <= lastMerged[1]) {
                // Merge the intervals by updating the end time
                lastMerged[1] = Math.max(lastMerged[1], current[1]);
            } else {
                // No overlap, add the current interval to the list
                merged.add(current);
            }
        }

        // Convert the list to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 4},
            {2, 5},
            {7, 9},
            {8, 10},
            {15, 18},
            {17, 20}
        };

        int[][] mergedIntervals = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
