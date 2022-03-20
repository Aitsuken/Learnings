import sorting.Sorting;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + rand.nextInt(100000);
        }
        sorting.Sorting.quicksort(arr, 0, arr.length - 1);
        sorting.Sorting.quicksort(50);


    }

}
