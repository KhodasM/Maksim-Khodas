package Sortings;

import java.util.List;

public interface SorterMethods{
  List<Integer> sort(List<Integer> list) throws Exception;

  int getSizeLimit();

  void setSizeLimit(int limit);

  PossibleSortings type();
}
