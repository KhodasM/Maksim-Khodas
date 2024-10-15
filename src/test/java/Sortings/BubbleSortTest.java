package Sortings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BubbleSortTest {
  public static final List<Integer> list = List.of(9, 8, 0, 1, 7, 6, 2, 3, 5, 4);
  public static final List<Integer> sortedList = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

  @Test
  void testType() {
    assertEquals(PossibleSortings.BUBBLESORT, new BubbleSort(10).type());
  }

  @Test
  void testSort() throws Exception {
    BubbleSort bubbleSort = new BubbleSort(10);
    assertEquals(sortedList, bubbleSort.sort(list));
  }

  @Test
  void testSortWithExeption() {
    List<Integer> list = List.of(9, 8, 0, 1, 7, 6, 2, 3, 5, 4);
    BubbleSort sorter = new BubbleSort(5);
    assertThrows(Exception.class, () -> sorter.sort(list));
  }

  @Test
  void setSizeLimitWithExceptionTest() {
    MergeSort sorter = new MergeSort(17);
    int n = -5;
    assertThrows(IllegalArgumentException.class, () -> sorter.setSizeLimit(n));
  }

  @Test
  void getSizeLimitTest() {
    int n = 5;
    MergeSort sorter = new MergeSort(n);
    assertEquals(n, sorter.getSizeLimit());
  }
}