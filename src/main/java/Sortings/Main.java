package Sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    SortingSelector select = new SortingSelector(new ArrayList<>());
    select.add(new BubbleSort(10));
    select.add(new MergeSort(10));
    select.add(new BubbleSort(100));
    select.add(new MergeSort(100));
    List<Integer> listB = Arrays.asList(13, -1, 0, 17, 6, 24, -11, 11, -1, 7, 3, 18);
    List<Integer> sortedListB = select.sort(listB, PossibleSortings.BUBBLESORT);
    List<Integer> listM = Arrays.asList(1, 4, -9, -4, 1, 234, 0, 13);
    List<Integer> sortedListM = select.sort(listM, PossibleSortings.BUBBLESORT);
    System.out.println(sortedListB.toString());
    System.out.println(sortedListM.toString());
  }
}
