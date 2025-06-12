package xyz;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2};
        System.out.println("Before sorting:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After sorting:");
        printArray(arr);
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
