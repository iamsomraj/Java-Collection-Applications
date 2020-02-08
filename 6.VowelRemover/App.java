import java.util.*;

class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n\nEnter the string:\n");
    String input = sc.nextLine();
    char[] ch = input.toCharArray();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
    linkedHashSet.add("a");
    linkedHashSet.add("e");
    linkedHashSet.add("i");
    linkedHashSet.add("o");
    linkedHashSet.add("u");
    linkedHashSet.add("A");
    linkedHashSet.add("E");
    linkedHashSet.add("I");
    linkedHashSet.add("O");
    linkedHashSet.add("U");

    for (int i = 0; i < ch.length; i++) {
      if (!linkedHashSet.contains(String.valueOf(ch[i]))) {
        System.out.printf("%c", ch[i]);
      }
    }
  }
}