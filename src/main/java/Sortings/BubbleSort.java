package Sortings;

import java.util.List;

public class BubbleSort extends Sorter {
  public BubbleSort(int sizeLimit) {
    super(sizeLimit);
  }

  @Override
  public PossibleSortings type() {
    return PossibleSortings.BUBBLESORT;
  }

  @Override
  public List<Integer> sort(List<Integer> list) throws Exception {
    super.wrap(list);
    if (wrapper.size() > sizeLimit) {
      throw new Exception("Превышен лимит размера списка для сортировки пузырьком, должно быть не больше "
          + sizeLimit + " элементов");
    }
    List<Integer> answer = wrapper.cloneList();
    for (int i = 0; i < answer.size(); i++) {
      for (int j = i + 1; j < answer.size(); j++) {
        if (answer.get(i) > answer.get(j)) {
          int temp = answer.get(i);
          answer.set(i, answer.get(j));
          answer.set(j, temp);
        }
      }
    }
    return answer;
  }
}
