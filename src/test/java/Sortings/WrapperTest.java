package Sortings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WrapperTest {

  @Test
  void cloneList() {
    List<Integer> list = Arrays.asList(9, 0, 8, 1, 7, 2, 6, 3, 5, 4);
    Wrapper<Integer> wrapper = new Wrapper<Integer>(list);
    assertEquals(list, wrapper.cloneList());
  }

  @Test
  void size() {
    List<Integer> list = Arrays.asList(9, 0, 8, 1, 7, 2, 6, 3, 5, 4);
    Wrapper<Integer> wrapper = new Wrapper<Integer>(list);
    assertEquals(list.size(), wrapper.size());
  }
}

