package Sortings;

import java.util.List;

abstract public class Sorter implements SorterMethods {
  protected Wrapper<Integer> wrapper;
  protected int sizeLimit;

  protected Sorter(int sizeLimit) {
    this.sizeLimit = sizeLimit;
  }

  protected void wrap(List<Integer> list) {
    wrapper = new Wrapper<Integer>(list);
  }

  public int getSizeLimit() {
    return sizeLimit;
  }

  public void setSizeLimit(int newSizeLimit){
    if (newSizeLimit <= 0) {
      throw new IllegalArgumentException("Size limit must be positive");
    }
    sizeLimit = newSizeLimit;
  }
}
