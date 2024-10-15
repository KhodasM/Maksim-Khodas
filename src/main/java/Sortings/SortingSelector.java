package Sortings;

import java.util.List;

public class SortingSelector {
  List<Sorter> listOfSortings;

  public SortingSelector(List<Sorter> listOfSortings) {
    this.listOfSortings = listOfSortings;
  }

  public void add(Sorter sorter) {
    listOfSortings.add(sorter);
  }

  public List<Integer> sort(List<Integer> list, PossibleSortings type) throws Exception {
    boolean isExist = false;
    for (Sorter sorter : listOfSortings) {
      if (sorter.type().equals(type)) {
        isExist = true;
        try {
          return sorter.sort(list);
        } catch (Exception e) {
          System.out.println("Ошибка при использовании сортировки " + sorter + ": " + e);
        }
      }
    }
    if (!isExist) {
      System.out.println("Такая сортировка не найдена");
    }
    return list;
  }
}
