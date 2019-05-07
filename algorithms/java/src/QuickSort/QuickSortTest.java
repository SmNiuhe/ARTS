package QuickSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quick_sort() {

        int[] A = {1, 5, 6, 2, 3, 4};
        System.out.println(Arrays.toString(A));
        QuickSort.quick_sort(A, A.length);
        System.out.println(Arrays.toString(A));
    }
}