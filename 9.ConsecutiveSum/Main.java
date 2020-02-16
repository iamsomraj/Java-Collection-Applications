import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the string: \n");
    String input = sc.nextLine();
    String inp[] = input.split("");
    ArrayList<String> numbers = new ArrayList<String>(Arrays.asList(inp));
    System.out.println("\nEnter the sum for which\nyou want to filter the string:\n");
    int sum = sc.nextInt();
    for (int i = 0; i < numbers.size() - 1; i++) {
      int a = Integer.parseInt(numbers.get(i));
      int b = Integer.parseInt(numbers.get(i + 1));
      if (a + b == sum) {
        numbers.remove(i);
        numbers.remove(i);
        i = -1;
      }
    }
    // this is extra checking done for 2 element array
    if (numbers.size() == 2) {
      int i = 0;
      int a = Integer.parseInt(numbers.get(i));
      int b = Integer.parseInt(numbers.get(i + 1));
      if (a + b == sum) {
        numbers.remove(i);
        numbers.remove(i);
      }
    }
    System.out.println("\nThe array becomes: \n");
    if (numbers.isEmpty()) {
      System.out.println("\nThe array is empty!\n");
    } else {
      numbers.forEach(System.out::printf);
    }
    System.out.println("\n\nThe answer is :\n\n");
    System.out.println(numbers.size());
  }
}