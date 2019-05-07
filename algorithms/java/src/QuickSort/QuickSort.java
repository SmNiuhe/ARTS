package QuickSort;

public class QuickSort {


    public static void quick_sort(int[] A, int n) {

        quick_sort_c(A, 0, n - 1);
    }


    // 递归调用函数
    private static void quick_sort_c(int[] A, int p, int r) {
        if (p >= r) return;

        // 获取分区点
        int q = partition(A, p, r);

        // 分治递归
        quick_sort_c(A, p, q - 1);
        quick_sort_c(A, q + 1, r);
    }


    private static int partition(int[] A, int p, int r) {

        int pivot = A[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (A[j] < pivot) {

                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
            }
        }

        int temp = A[i];
        A[i] = A[r];
        A[r] = temp;

        return i;
    }


}
