package CustomArrayListHomework;

public class Main {
  public static void main(String[] args) {
    CustomArrayList<Integer> arr = new CustomArrayList<>();
    arr.add(1, -1);
    arr.add(5, 0);
    arr.add(8, -1);
    arr.add(11, 1);
    System.out.println(arr.get(0));
    System.out.println(arr.get(1));
    System.out.println(arr.get(2));
    System.out.println(arr.get(3));
    arr.remove(1);
    arr.remove(1);
    System.out.println("---------");
    System.out.println(arr.get(0));
    System.out.println(arr.get(1));
    System.out.println(arr.get(2));
  }
}