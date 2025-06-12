package xyz;

public class KadanesAlgorithm {
    public static int findMaxSubarraySum(int[] arr) {
        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubarraySum = findMaxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSubarraySum);
    }
}
