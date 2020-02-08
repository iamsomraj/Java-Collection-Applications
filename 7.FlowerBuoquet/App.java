import java.util.*;

class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of the elements: \n");
    int num = sc.nextInt();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    System.out.println("\nEnter the elements one by one:\n");
    for (int i = 0; i < num; i++) {
      linkedList.add(sc.nextInt());
    }
    Collections.sort(linkedList);
    int mid = Math.round(num/2);
    System.out.println("\n\nThe buoquet becomes: \n\n");
    for (int i = 0; i < mid; i++) {
      System.out.printf("%d ",linkedList.get(i));
    }
    for (int i = linkedList.size()-1 ; i > mid-1; i--) {
      System.out.printf("%d ",linkedList.get(i));
    }

  }
}