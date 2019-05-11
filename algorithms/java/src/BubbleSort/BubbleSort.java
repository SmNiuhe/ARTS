package BubbleSort;

public class BubbleSort {

    public static void bubbleSort(int[] a, int n) {

        if (n <= 0) return;
        boolean isSwap = false;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    isSwap = true;
                }
            }

            if (!isSwap) break;
        }

    }

}