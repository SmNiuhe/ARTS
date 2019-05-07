package mergeSort;

import com.sun.scenario.effect.Merge;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class mergeSortTest {

    @Test
    public void merge_sort() {

        int[] A = {1, 5, 6, 2, 3, 4};

        System.out.println(Arrays.toString(A));
        mergeSort mergeSort = new mergeSort();
        mergeSort.merge_sort(A, A.length);
        System.out.println(Arrays.toString(A));
    }
}