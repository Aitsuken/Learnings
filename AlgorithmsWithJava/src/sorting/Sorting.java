package sorting;

public class Sorting {

    public static void quicksort(int[] arr, int lowIndex, int highIndex) {

        int pivot = arr[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            return;
        }
    }

    public static void quicksort(int x) {
        System.out.println("Hello World!");
    }

    private void swap(int[] arr, int i1, int i2) {
        int t = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = t;
    }
}
