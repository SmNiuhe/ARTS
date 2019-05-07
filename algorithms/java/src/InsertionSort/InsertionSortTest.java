package InsertionSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort() {

        int[] a = {5, 6, 7, 11, 2};
        System.out.println("InsertionSort before : " + Arrays.toString(a));
        InsertionSort.InsertionSort(a, a.length);
        System.out.println("InsertionSort after : " + Arrays.toString(a));
    }
}