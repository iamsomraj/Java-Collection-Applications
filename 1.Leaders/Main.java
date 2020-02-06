import java.util.*;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("\nEnter the number of elements : \n");
    n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    System.out.println("\n\nThe leaders are displayed : \n");
    for (int i = 0; i < arr.size() - 1; i++) {
      int k = i;
      for (int j = i + 1; j < arr.size(); j++) {
        if (arr.get(i) > arr.get(j)) {
          k++;
        } else {
          break;
        }
      }
      if (k == arr.size() - 1) {
        System.out.println(arr.get(i));
      }
    }
    System.out.println(arr.get(arr.size() - 1));

  }
}