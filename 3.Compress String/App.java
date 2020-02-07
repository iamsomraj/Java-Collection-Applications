import java.util.*;

class App {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    String input = new String();
    System.out.println("\nEnter the string: \n");
    input = sc.nextLine();
    for (int i = 0; i < input.length(); i++) {
      map.put(String.valueOf(input.charAt(i)), 0);
    }
    for (int i = 0; i < input.length(); i++) {
      int number = map.get(String.valueOf(input.charAt(i)));
      number++;
      map.put(String.valueOf(input.charAt(i)), number);
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey());
      if (entry.getValue() != 1) {
        System.out.println(entry.getValue());
      }
    }
  }
}