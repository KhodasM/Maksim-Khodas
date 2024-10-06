package CustomArrayListHomework;

/**
 * ArrayMethods is an interface with based methods of ArrayLists
 * @param <A> - the type of elements in arrayList
 */
public interface CustomArrayListMethods<A> {

  /**
   *  adding an element to CustomArrayList
   * @param element - element to add, @param index -
   * index to add, if (index == -1), element adds to the end
   */
  void add(A element, int index);

  /**
   *  removing an element from CustomArrayList
   * @param index - index of removing element
   */
  void remove(int index);

  /**
   *  getting an element from CustomArrayList
   * @param index - index of getting element
   * @return an element with index "index"
   */
  A get(int index);
}
