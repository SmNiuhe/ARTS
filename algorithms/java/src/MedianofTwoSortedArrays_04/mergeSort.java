package MedianofTwoSortedArrays_04;

public class mergeSort {


    public void merge_sort(int[] A, int n) {
        // 归并排序算法, A 是数组，n 表示数组大小
        merge_sort_c(A, 0, n - 1);
    }


    // 递归调用函数
    private void merge_sort_c(int[] A, int p, int r) {
        if (p >= r) return;
        // 取 p 到 r 之间的中间位置 q
        int q = (p + r) / 2;

        // 分治递归
        merge_sort_c(A, p, q);
        merge_sort_c(A, q + 1, r);

        // 将 A[p...q] 和 A[q+1...r] 合并为 A[p...r]
        merge(A, p, q, r);
    }


    private void merge(int[] A, int p, int q, int r) {

        int i = p, j = q + 1, k = 0;  // 初始化变量 i, j, k
        int[] tmp = new int[A.length];  // 申请一个大小跟 A[p...r] 一样的临时数组
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[k++] = A[i++]; // i++ 等于 i:=i+1
            } else {
                tmp[k++] = A[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i, end = q;

        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组 tmp
        while (start <= end) {
            tmp[k++] = A[start++];
        }


        // 将 tmp 中的数组拷贝回 A[p...r]
        for (int z = 0; z <= r - p; z++) {
            A[p + z] = tmp[z];
        }
    }


}
