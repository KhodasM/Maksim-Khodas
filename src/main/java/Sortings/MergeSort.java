package Sortings;

import java.util.Collections;
import java.util.List;

public class MergeSort extends Sorter {
  public MergeSort(int sizeLimit) {
    super(sizeLimit);
  }

  @Override
  public PossibleSortings type() {
    return PossibleSortings.MERGESORT;
  }

  @Override
  public List<Integer> sort(List<Integer> list) throws Exception {
    super.wrap(list);
    if (wrapper.size() > sizeLimit) {
      throw new Exception("Превышен лимит размера списка для сортировки слиянием, должно быть не больше "
          + sizeLimit + " элементов");
    }
    List<Integer> answer = wrapper.cloneList();
    Collections.sort(answer);
    return answer;
  }
}