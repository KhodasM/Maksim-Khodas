package Sortings;

import java.util.ArrayList;
import java.util.List;

public class Wrapper<Integer> {
  private final List<Integer> array;

  public Wrapper(List<Integer> list) {
    this.array = new ArrayList<Integer>(list);
  }

  public List<Integer> cloneList() {
    return new ArrayList<Integer>(array);
  }

  public int size() {
    return array.size();
  }
}