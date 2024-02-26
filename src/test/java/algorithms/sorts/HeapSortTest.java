package algorithms.sorts;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class HeapSortTest {

    @Test
    public void testIntegerSort() {
        Integer[] unsorted = { 4, 10, 3, 5, 1 };
        Integer[] expected = { 1, 3, 4, 5, 10 };
        HeapSort heapSort = new HeapSort();
        assertArrayEquals(expected, heapSort.sort(unsorted));
    }

    @Test
    public void testStringSort() {
        String[] unsorted = { "banana", "apple", "orange", "grape" };
        String[] expected = { "apple", "banana", "grape", "orange" };
        HeapSort heapSort = new HeapSort();
        assertArrayEquals(expected, heapSort.sort(unsorted));
    }

    @Test
    public void testEmptyArray() {
        Integer[] unsorted = {};
        Integer[] expected = {};
        HeapSort heapSort = new HeapSort();
        assertArrayEquals(expected, heapSort.sort(unsorted));
    }

    @Test
    public void testAlreadySortedArray() {
        Double[] unsorted = { 1.5, 2.0, 3.2, 4.7 };
        Double[] expected = { 1.5, 2.0, 3.2, 4.7 };
        HeapSort heapSort = new HeapSort();
        assertArrayEquals(expected, heapSort.sort(unsorted));
    }

    @Test
    public void testReverseSortedArray() {
        Character[] unsorted = { 'e', 'd', 'c', 'b', 'a' };
        Character[] expected = { 'a', 'b', 'c', 'd', 'e' };
        HeapSort heapSort = new HeapSort();
        assertArrayEquals(expected, heapSort.sort(unsorted));
    }
}
