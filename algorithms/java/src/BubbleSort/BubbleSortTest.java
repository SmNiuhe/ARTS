package BubbleSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {

        int[] a = {6, 2, 5, 8, 21, 3};
        System.out.println("BubbleSort before : " + Arrays.toString(a));
        BubbleSort.bubbleSort(a, a.length);
        System.out.println("BubbleSort after : " + Arrays.toString(a));
    }
}