import java.util.*;

class Frequent {
  int number;
  int frequency;

  Frequent(int num, int fre) {
    this.number = num;
    this.frequency = fre;
  }

  @Override
  public String toString() {
    return (String.valueOf(number) + " Frequency: " + String.valueOf(frequency));
  }

}

class App {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of the elements : \n");
    int number = sc.nextInt();
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
    System.out.println("\nEnter the elements one by one: \n");
    int a[] = new int[number];
    for (int i = 0; i < a.length; i++) {
      int in = sc.nextInt();
      a[i] = in;
      linkedHashSet.add(in);
    }
    ArrayList<Frequent> arrayList = new ArrayList<Frequent>();
    for (int i : linkedHashSet) {
      int count = 0;
      for (int j : a) {
        if (i == j) {
          count++;
        }
      }

      arrayList.add(new Frequent(i, count));
    }

    Collections.sort(arrayList, new Comparator<Frequent>() {
      @Override
      public int compare(Frequent o1, Frequent o2) {
        if (o1.frequency > o2.frequency) {
          return 1;
        } else if (o1.frequency < o2.frequency) {
          return -1;
        }
        return 0;
      }
    });
    System.out.println("\nAfter frequency sorting, the list becomes: \n");
    for (Frequent fr : arrayList) {
      System.out.println(fr);

    }

  }
}