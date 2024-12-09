package Sortings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MergeSortTest {
  public static final List<Integer> list = List.of(9, 0, 8, 1, 7, 2, 6, 3, 5, 4);
  public static final List<Integer> sortedList = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

  @Test
  void testType() {
    assertEquals(PossibleSortings.MERGESORT, new MergeSort(10).type());
  }

  @Test
  void testSort() throws Exception{
    MergeSort mergeSort = new MergeSort(10);

    assertEquals(sortedList, mergeSort.sort(list));
  }

  @Test
  void testSortThrows() {
    List<Integer> listToSort = List.of(9, 0, 8, 1, 7, 2, 6, 3, 5, 4);
    BubbleSort sorter = new BubbleSort(5);
    assertThrows(Exception.class, () -> sorter.sort(listToSort));
  }

  @Test
  void wrap() {
    MergeSort sorter = new MergeSort(17);
    List<Integer> list = List.of(3, 9, 1, 7, -2);
    sorter.wrap(list);
    assertEquals(list, sorter.wrapper.cloneList());
  }
}