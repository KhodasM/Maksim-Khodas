package Sortings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingSelectorTest {
  @Test
  void sort() throws Exception {
    MergeSort mergeSort = new MergeSort(10);
    MergeSort mergeSortBig = new MergeSort(100);
    BubbleSort bubbleSort = new BubbleSort(10);
    BubbleSort bubbleSortBig = new BubbleSort(100);

    SortingSelector selector = new SortingSelector(List.of(mergeSort, mergeSortBig, bubbleSort, bubbleSortBig));

    List<Integer> list = List.of(1, 4, -9, -4, 1, 234, 0, 13);
    List<Integer> listMustResult = List.of(-9, -4, 0, 1, 1, 4, 13, 234);

    List<Integer> sortedList = selector.sort(list, PossibleSortings.MERGESORT);

    assertEquals(sortedList, listMustResult);
  }
}
