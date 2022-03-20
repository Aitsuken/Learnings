package Searching;

public class Linear {
    public static int linear(int key, int[] x) {
        //int index;
        for (int i = 0; i < x.length; i++) {

            if (key == x[i]) {
                return i;
            }
        }
        return 0;
    }
}
