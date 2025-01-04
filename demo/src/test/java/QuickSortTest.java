import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.example.QuickSort;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    // Test for passing an array with a single element
    @Test
    public void testQuickSort1() {
        QuickSort qs = new QuickSort();
        int[] arr = { 5 };
        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 5 }, arr);
    }

    // Test for passing an array with a single duplicate element
    @Test
    public void testQuickSort2() {
        QuickSort qs = new QuickSort();
        int[] arr = { 5, 5, 5, 5 };
        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 5, 5, 5 , 5 }, arr);
    }

    // Test for passing a sorted array
    @Test
    public void testQuickSort3() {
        QuickSort qs = new QuickSort();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, arr);
    }

    // Test for passing an empty array
    @Test
    public void testQuickSort4() {
        QuickSort qs = new QuickSort();
        int[] arr = {};
        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] {}, arr);
    }

    /**
     * Method under test: {@link QuickSort#quickSort(int[], int, int)}
     */
    //Diffblue Cover covered the test including negative values
    @Test
    void testQuickSort5() {

        // Arrange and Act
        QuickSort qs = new QuickSort();
        int[] arr = {-1, 0, 1, 0};
        qs.quickSort(arr, 0, 3);
        assertArrayEquals(new int[] {-1, 0, 0, 1}, arr);
    }

    // Test for passing an array with duplicate values
    /**
     * Method under test: {@link QuickSort#quickSort(int[], int, int)}
     */
    @Test
    public void testQuickSort6() {
        QuickSort qs = new QuickSort();
        int[] arr = { 8, 2, 8, 8, 9, 2, 1, 0, 4 };
        qs.quickSort(arr, 0, 8);
        assertArrayEquals(new int[] { 0, 1, 2, 2, 4, 8, 8, 8, 9 }, arr);
    }

    // Test for passing an unsorted array
    /**
     * Method under test: {@link QuickSort#quickSort(int[], int, int)}
     */
    @Test
    public void testQuickSort7() {
        QuickSort qs = new QuickSort();
        int[] arr = { 7, 3, 6, 0, 9, 2, 5 };
        qs.quickSort(arr, 0, 6);
        assertArrayEquals(new int[] { 0, 2, 3, 5, 6, 7, 9 }, arr);
    }

    // Test for passing a reverse sorted array
    @Test
    public void testQuickSort8() {
        QuickSort qs = new QuickSort();
        int[] arr = { 5, 4, 3, 2, 1 };
        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

}