import java.util.*;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of elements : \n");
    int n = sc.nextInt();
    System.out.println("\nEnter the elements one by one : \n");
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    int min = arr.get(0);
    int maxDiff = arr.get(1) - arr.get(0);
    for (int i = 0; i < arr.size(); i++) {

      if (arr.get(i) - min > maxDiff) {
        maxDiff = arr.get(i) - min;
      }
      if (arr.get(i) < min) {
        min = arr.get(i);
      }
    }

    System.out.println("\n\nMaximum difference : \n" + maxDiff);
  }

}