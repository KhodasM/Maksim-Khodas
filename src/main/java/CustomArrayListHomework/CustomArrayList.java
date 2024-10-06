package CustomArrayListHomework;

/**
 *  CustomArrayList is a naive copy of array list
 * @param <A> - the type of elements in CustomArrayList
 */
public class CustomArrayList<A> implements CustomArrayListMethods<A> {

  /**
   * arr - structure where will be all elements
   * number_of_elements - field where will be info about number of elements in array at the moment
   * capacity - field where will be info about max number of elements in array at the moment
   */
  private Object[] arr;
  private int number_of_elements;
  private int capacity;

  /**
   * init arr, set start capacity, set number_of_elements
   */
  public CustomArrayList() {
    capacity = 16;
    number_of_elements = 0;
    arr = new Object[capacity];
  }

  /**
   * increasing a capacity of CustomArrayList
   */
  private void increase() {
    capacity = (int) (capacity * 1.5) + 1;
    Object[] new_array = new Object[capacity];
    System.arraycopy(arr, 0, new_array, 0, number_of_elements);
    arr = new_array.clone();
  }

  /**
   * adding a new element to CustomArrayList
   * @param element - a new element in array. Index - Its place.
   */
  @Override
  public void add(A element, int index) {
    if (number_of_elements + 1 >= capacity) {
      increase();
    }
    if (index != -1) {
      System.arraycopy(arr, index, arr, index + 1, number_of_elements - index);
      arr[index] = element;
    }
    else arr[number_of_elements] = element;
    number_of_elements++;
  }

  /**
   * removing an element from CustomArrayList
   * @param index - an index of removing element
   */
  @Override
  public void remove(int index) {
    if (index < 0 || index >= number_of_elements)
      throw new IndexOutOfBoundsException("Element with index " + index + " is not exist");
    System.arraycopy(arr, index + 1, arr, index, number_of_elements - index - 1);
    number_of_elements--;
  }

  /**
   * getting an element from arrayList
   * @param index - an index of getting element
   * @return an element with index "index"
   */
  @Override
  public A get(int index) {
    if (index < 0 || index >= number_of_elements)
      throw new IndexOutOfBoundsException("Element with index " + index + " is not exist");
    return (A) arr[index];
  }
}

